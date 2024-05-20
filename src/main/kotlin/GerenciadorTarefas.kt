package org.example

import org.example.casosdeuso.ListarTarefas
import org.example.menus.*

class GerenciadorTarefas(
    private val menuTarefa: MenuTarefa,
    private val listarTarefas: ListarTarefas,
    private val menuBuscarTarefa: MenuBuscarTarefa,
    private val menuAtualizarTarefa: MenuAtualizarTarefa,
    private val menuConcluirTarefa: MenuConcluirTarefa,
    private val menuExcluirTarefa: MenuExcluirTarefa
) {
    private val tarefasAfazer = mutableListOf<Tarefa>()
    fun adicionarTarefa(): Boolean{
        val tarefa = menuTarefa.exibirMenuCriarTarefa()
        return tarefasAfazer.add(tarefa)
    }
    fun exibirTarefasAFazer(){
        listarTarefas.listar(tarefasAfazer)
    }
    fun buscarTarefa(){
        menuBuscarTarefa.executar(lista = tarefasAfazer)
    }
    fun atualizarTarefa(){
        menuAtualizarTarefa.iniciar(tarefasAfazer)
    }
    fun concluirTarefa(){
        menuConcluirTarefa.exibirMenu(tarefasAfazer)
    }
    fun excluirTarefa(){
        menuExcluirTarefa.exibirMenu(tarefasAfazer)
    }

}