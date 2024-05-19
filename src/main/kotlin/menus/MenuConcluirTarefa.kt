package org.example.menus

import org.example.Tarefa
import org.example.casosdeuso.ConcluirTarefa
import java.util.*

class MenuConcluirTarefa(
    private val concluirTarefa: ConcluirTarefa,
    private val scanner: Scanner = Scanner(System.`in`)
) {
    fun exibirMenu(lista: MutableList<Tarefa>){
        var continuar = true
        while (continuar){
            println("Informe o id da tarefa para concluir: ")
            var entrada = scanner.nextLine().trim()
            val id = UUID.fromString(entrada)
            concluirTarefa.concluir(id, lista)
            println("Digite -m para voltar ao menu inicial ou qualquer tecla para continuar marcando as tarefas como concluída.")
            entrada = scanner.nextLine().trim()
            if (entrada == "-m"){
                continuar = false
            }
        }
    }
}