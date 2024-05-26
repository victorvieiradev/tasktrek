package org.example.casosdeuso

import org.example.model.Tarefa
import java.util.UUID

class ExcluirTarefa {
    fun excluir(id: UUID, lista: MutableList<Tarefa>){
        val indiceTarefa = lista.indexOfFirst { it.id == id }
        if (indiceTarefa != -1){
            lista.removeAt(indiceTarefa)
            println("Removido com sucesso!")
        }else {
            println("O id: $id não existe ou a tarefa já foi removida.")
        }
    }
}