package org.example

import org.example.casosdeuso.*
import org.example.menus.*
import org.example.util.EntradaUUID

fun main() {
    val entrada = EntradaUUID()
    val definirPrioridade = DefinirPrioridade()
    val menuDefinirPrioridade= MenuDefinirPrioridade(
        definirPrioridade,
        entrada
    )
    val excluirTarefa = ExcluirTarefa()
    val menuExcluirTarefa = MenuExcluirTarefa(
        excluirTarefa,
        entrada
    )
    val concluirTarefa = ConcluirTarefa()
    val menuConcluirTarefa= MenuConcluirTarefa(
        concluirTarefa,
        entrada
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
        atualizarTarefa,
        entrada
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