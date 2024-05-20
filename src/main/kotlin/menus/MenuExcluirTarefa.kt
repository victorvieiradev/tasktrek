package org.example.menus

import org.example.Tarefa
import org.example.casosdeuso.ExcluirTarefa
import java.util.*

class MenuExcluirTarefa(
    private val excluirTarefa: ExcluirTarefa,
    private val scanner: Scanner = Scanner(System.`in`)
) {
    fun exibirMenu(lista: MutableList<Tarefa>){
        val continuar = true
        while (continuar){
            println("Informe o id da tarefa a ser removida: \nOu digite -m para voltar ao menu inicial.")
            val entrada = scanner.nextLine().trim()
            if ("-m" == entrada){
                println("Voltando ao menu inicial.")
                break
            }
            val id = UUID.fromString(entrada)
            excluirTarefa.excluir(id, lista)

        }
    }
}