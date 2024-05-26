package org.example.casosdeuso

import org.example.model.Tarefa

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