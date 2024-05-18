package org.example

class GerenciadorTarefas(
    private val menuTarefa: MenuTarefa,
    private val listarTarefas: ListarTarefas,
    private val menuBuscarTarefa: MenuBuscarTarefa,
    private val menuAtualizarTarefa: MenuAtualizarTarefa
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

}