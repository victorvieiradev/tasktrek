package org.example.menus

import org.example.casosdeuso.ExcluirTarefa
import org.example.model.Tarefa
import org.example.util.EntradaUUID

class MenuExcluirTarefa(
    private val excluirTarefa: ExcluirTarefa,
    private val entradaUUID: EntradaUUID,
) {
    fun exibirMenu(lista: MutableList<Tarefa>) {
        val id = entradaUUID.solicitarUUID()
        if (id != null) {
            excluirTarefa.excluir(id, lista)
        }
    }
}