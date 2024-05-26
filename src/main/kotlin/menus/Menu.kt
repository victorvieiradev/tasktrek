package org.example.menus

import org.example.GerenciadorTarefas
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
        } while (opcao != 8)
    }

    private fun validarEntradaDoUsuario(opcao: Int) {
        when (opcao) {
            1 -> gerenciadorTarefas.adicionarTarefa()
            2 -> gerenciadorTarefas.exibirTarefasAFazer()
            3 -> gerenciadorTarefas.buscarTarefa()
            4 -> gerenciadorTarefas.atualizarTarefa()
            5 -> gerenciadorTarefas.concluirTarefa()
            6 -> gerenciadorTarefas.excluirTarefa()
            7 -> gerenciadorTarefas.definirPrioridade()
            8 -> println("Saindo...")
            else -> println("Opção inválida! Tente novamente.")
        }
    }


    private fun exibirObcoesDoMenu() {
        println("Menu:")
        println("1 - Adicionar tarefa")
        println("2 - Exibir tarefas")
        println("3 - Buscar tarefa")
        println("4 - Atualizar tarefa")
        println("5 - concluir tarefa")
        println("6 - Excluir tarefa")
        println("7 - Definir prioridade ")
        println("8 - Sair")
        print("Escolha uma opção: ")
    }


}

