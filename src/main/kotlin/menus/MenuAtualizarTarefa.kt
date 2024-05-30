package org.example.menus

import org.example.casosdeuso.AtualizarTarefa
import org.example.model.Tarefa
import org.example.util.EntradaUUID

class MenuAtualizarTarefa(
    private val atualizarTarefa: AtualizarTarefa,
    private val entradaUUID: EntradaUUID
) {
    fun exibirMenu(lista: MutableList<Tarefa>) {
        val id = entradaUUID.solicitarUUID()
        if (id != null) {
            atualizarTarefa.atualizarTarefa(id, lista)
        }

    }

}