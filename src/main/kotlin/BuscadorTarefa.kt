package org.example

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

    private fun realizarFiltroNaLista(
        lista: MutableList<Tarefa>,
        pesquisa: String
    ): List<Tarefa> = lista.filter { tarefa: Tarefa ->
        tarefa.titulo.contains(pesquisa, ignoreCase = true) ||
                tarefa.descricao.contains(pesquisa, ignoreCase = true)
    }
}