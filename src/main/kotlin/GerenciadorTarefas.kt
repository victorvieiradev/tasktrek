package org.example

import org.example.casosdeuso.ListarTarefas
import org.example.menus.*
import org.example.model.Tarefa

class GerenciadorTarefas(
    private val menuTarefa: MenuTarefa,
    private val listarTarefas: ListarTarefas,
    private val menuBuscarTarefa: MenuBuscarTarefa,
    private val menuAtualizarTarefa: MenuAtualizarTarefa,
    private val menuConcluirTarefa: MenuConcluirTarefa,
    private val menuExcluirTarefa: MenuExcluirTarefa,
    private val menuDefinirPrioridade: MenuDefinirPrioridade
) {
    private val tarefasAfazer = mutableListOf<Tarefa>()
    fun adicionarTarefa(): Boolean {
        val tarefa = menuTarefa.exibirMenuCriarTarefa()
        return tarefasAfazer.add(tarefa)
    }

    fun exibirTarefasAFazer() {
        listarTarefas.listar(tarefasAfazer)
    }

    fun buscarTarefa() {
        menuBuscarTarefa.exibirMenu(lista = tarefasAfazer)
    }

    fun atualizarTarefa() {
        menuAtualizarTarefa.exibirMenu(tarefasAfazer)
    }

    fun concluirTarefa() {
        menuConcluirTarefa.exibirMenu(tarefasAfazer)
    }

    fun excluirTarefa() {
        menuExcluirTarefa.exibirMenu(tarefasAfazer)
    }

    fun definirPrioridade() {
        menuDefinirPrioridade.exibirMenu(tarefasAfazer)
    }

}