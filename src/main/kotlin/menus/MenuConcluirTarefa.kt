package org.example.menus

import org.example.casosdeuso.ConcluirTarefa
import org.example.model.Tarefa
import org.example.util.EntradaUUID

class MenuConcluirTarefa(
    private val concluirTarefa: ConcluirTarefa,
    private val entradaUUID: EntradaUUID
) {
    fun exibirMenu(lista: MutableList<Tarefa>){
        val id = entradaUUID.solicitarUUID()
        if (id != null){
            concluirTarefa.concluir(id, lista)
        }
    }
}