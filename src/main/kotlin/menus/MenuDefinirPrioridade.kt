package org.example.menus

import org.example.casosdeuso.DefinirPrioridade
import org.example.enums.Prioridade
import org.example.model.Tarefa
import java.util.*

class MenuDefinirPrioridade(
    private val definirPrioridade: DefinirPrioridade
) {
    private val scanner: Scanner = Scanner(System.`in`)
    fun exibirMenu(lista: MutableList<Tarefa>) {
        while (true) {
            println("Informe o id da tarefa a ser alterada a sua prioridade: \nOu Digite -m para voltar ao menu inicial: ")
            val entrada = scanner.nextLine().trim()
            if (entrada != "-m") {
                println(validarOpcoesDaPrioridade(entrada, lista))
            } else {
                println("voltando ao menu inicial")
                break
            }

        }
    }

    private fun validarOpcoesDaPrioridade(entrada: String, lista: MutableList<Tarefa>): String {
        val id = UUID.fromString(entrada)
        println("Informe: \n1 - Prioridade baixa \n2 - Prioridade média \n3 - Prioridade Alta")
        var op = scanner.nextLine().trim()
        while (op.isEmpty()) {
            println("A entrada não pode estar em branca. \n Informe uma opção.")
            op = scanner.nextLine().trim()
        }
        return when (op) {
            "1" -> {
                definirPrioridade.definir(id, Prioridade.BAIXA, lista)
            }

            "2" -> {
                definirPrioridade.definir(id, Prioridade.MEDIA, lista)
            }

            "3" -> {
                definirPrioridade.definir(id, Prioridade.ALTA, lista)
            }

            else -> {
                "Opção inválida."
            }
        }


    }
}