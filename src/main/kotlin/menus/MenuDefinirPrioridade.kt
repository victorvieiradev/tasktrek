package org.example.menus

import org.example.casosdeuso.DefinirPrioridade
import org.example.enums.Prioridade
import org.example.model.Tarefa
import org.example.util.EntradaUUID
import java.util.*

class MenuDefinirPrioridade(
    private val definirPrioridade: DefinirPrioridade,
    private val entradaUUID: EntradaUUID
) {
    private val scanner: Scanner = Scanner(System.`in`)
    fun exibirMenu(lista: MutableList<Tarefa>) {
        val id = entradaUUID.solicitarUUID()
        if (id != null){
            validarOpcoesDaPrioridade(id, lista)
        }
    }

    private fun validarOpcoesDaPrioridade(id: UUID, lista: MutableList<Tarefa>): String {
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