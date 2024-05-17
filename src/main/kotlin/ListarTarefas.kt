package org.example

class ListarTarefas {
    fun listar(lista: List<Tarefa>) {
        for (tarefa in lista) {
            exibirInformacoesTarefa(tarefa)
        }
    }

    private fun exibirInformacoesTarefa(tarefa: Tarefa) {
        println(tarefa.toString())
    }
}