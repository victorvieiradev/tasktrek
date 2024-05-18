package org.example

import java.util.*

class AtualizarTarefa {
    private val scanner = Scanner(System.`in`)

    fun atualizarTarefa(id: UUID, lista: MutableList<Tarefa>) {
        val index = lista.indexOfFirst { it.id == id }
        if (index != -1) {
            println("Digite o novo título da tarefa:")
            var novoTitulo = scanner.nextLine()
            while (novoTitulo.isEmpty()) {
                println("O título não pode estar em branco.")
                println("Digite o novo título da tarefa:")
                novoTitulo = scanner.nextLine()
            }

            println("Digite a nova descrição da tarefa:")
            var novaDescricao = scanner.nextLine()
            while (novaDescricao.isEmpty()) {
                println("A descrição não pode está em branca.")
                println("Digite a nova descrição da tarefa:")
                novaDescricao = scanner.nextLine()
            }


            lista[index] = Tarefa(
                id,
                novoTitulo,
                novaDescricao
            )


        }
        println("Tarefa com id $id não encontrada.")
    }

}
