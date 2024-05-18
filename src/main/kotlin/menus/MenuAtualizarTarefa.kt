package org.example.menus

import org.example.AtualizarTarefa
import org.example.Tarefa
import java.util.*

class MenuAtualizarTarefa(
    private val atualizarTarefa: AtualizarTarefa,
    private val scanner: Scanner = Scanner(System.`in`)
) {
    fun iniciar(lista: MutableList<Tarefa>) {
        var continuar = true
        while (continuar) {
            println("Digite o ID da tarefa que deseja atualizar (ou -m para cancelar):")
            val entrada = scanner.nextLine().trim()
            if (entrada == "-m") {
                println("Atualização cancelada.")
                continuar = false
                break
            }
            val id = UUID.fromString(entrada)
            atualizarTarefa.atualizarTarefa(id, lista)
        }
    }

    }