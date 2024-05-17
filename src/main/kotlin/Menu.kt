package org.example

import java.util.*

class Menu(
    private val gerenciadorTarefas: GerenciadorTarefas
) {
    private val scanner = Scanner(System.`in`)

    fun exibirMenu() {
        var opcao: Int

        do {
            exibirObcoesDoMenu()

            opcao = scanner.nextInt()
            validarEntradaDoUsuario(opcao)
        } while (opcao != 6)
    }

    private fun validarEntradaDoUsuario(opcao: Int) {
        when (opcao) {
            1 -> gerenciadorTarefas.adicionarTarefa()
            2 -> gerenciadorTarefas.exibirTarefasAFazer()
            3 -> gerenciadorTarefas.buscarTarefa()
            4 -> ""//atualizarTarefa()"
            5 -> ""//excluirTarefa()"
            6 -> println("Saindo...")
            else -> println("Opção inválida! Tente novamente.")
        }
    }

    private fun exibirObcoesDoMenu() {
        println("Menu:")
        println("1 - Adicionar tarefa")
        println("2 - Exibir tarefas")
        println("3 - Buscar tarefa")
        println("4 - Atualizar tarefa")
        println("5 - Excluir tarefa")
        println("6 - Sair")
        print("Escolha uma opção: ")
    }


}

