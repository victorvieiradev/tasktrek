package org.example

import org.example.menus.Menu
import org.example.menus.MenuAtualizarTarefa
import org.example.menus.MenuBuscarTarefa
import org.example.menus.MenuTarefa

fun main() {
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
        menuAtualizarTarefa
    )
    val menu = Menu(
        gerenciadorTarefas = gerenciadorTarefas
    )
    menu.exibirMenu()

}