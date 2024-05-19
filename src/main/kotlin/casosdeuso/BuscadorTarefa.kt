package org.example.casosdeuso

import org.example.Tarefa
import java.util.UUID

class BuscadorTarefa(
    private val listarTarefas: ListarTarefas
) {
    fun buscar(pesquisa: String, lista: MutableList<Tarefa>) {
        val listaDeTarefaFiltrada = realizarFiltroNaLista(lista, pesquisa)
        if (listaDeTarefaFiltrada.isEmpty()) {
            println("Nenhuma tarefa encontrada com o termo de busca.")
        } else {
            listarTarefas.listar(listaDeTarefaFiltrada)
        }
    }

    fun buscarTarefaPeloId(id: UUID, lista: MutableList<Tarefa>): Any {
        val indexDaTarefaBuscada = lista.indexOfFirst { it.id == id }
        if (indexDaTarefaBuscada != -1){
            return  lista[indexDaTarefaBuscada]
        }
        return println("A tarefa com o id: $id não foi encontrada.")
    }

    private fun realizarFiltroNaLista(
        lista: MutableList<Tarefa>,
        pesquisa: String
    ): List<Tarefa> = lista.filter { tarefa: Tarefa ->
        tarefa.titulo.contains(pesquisa, ignoreCase = true) ||
                tarefa.descricao.contains(pesquisa, ignoreCase = true)
    }
}