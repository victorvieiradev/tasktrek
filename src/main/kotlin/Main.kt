package org.example

import org.example.casosdeuso.*
import org.example.menus.*

fun main() {
    val definirPrioridade = DefinirPrioridade()
    val menuDefinirPrioridade= MenuDefinirPrioridade(
        definirPrioridade
    )
    val excluirTarefa = ExcluirTarefa()
    val menuExcluirTarefa = MenuExcluirTarefa(
        excluirTarefa
    )
    val concluirTarefa = ConcluirTarefa()
    val menuConcluirTarefa= MenuConcluirTarefa(
        concluirTarefa
    )
    val criarTarefa = CriarTarefa()
    val listarTarefas = ListarTarefas()
    val menuTarefa = MenuTarefa(
        criarTarefa
    )
    val buscadorTarefa = BuscadorTarefa(
        listarTarefas = listarTarefas
    )
    val menuBuscarTarefa = MenuBuscarTarefa(
        buscadorTarefa = buscadorTarefa
    )
    val atualizarTarefa = AtualizarTarefa()
    val menuAtualizarTarefa = MenuAtualizarTarefa(
        atualizarTarefa
    )
    val gerenciadorTarefas = GerenciadorTarefas(
        menuTarefa,
        listarTarefas,
        menuBuscarTarefa,
        menuAtualizarTarefa,
        menuConcluirTarefa,
        menuExcluirTarefa,
        menuDefinirPrioridade
    )
    val menu = Menu(
        gerenciadorTarefas = gerenciadorTarefas
    )
    menu.exibirMenu()

}