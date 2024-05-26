package org.example.casosdeuso

import org.example.enums.Status
import org.example.model.Tarefa
import java.util.UUID

class ConcluirTarefa {
    fun concluir(id: UUID, lista: MutableList<Tarefa>) {
        val index = lista.indexOfFirst { it.id == id }
        if (validarSeEPermitidoMarcarComoConcluido(index, lista)){
            lista[index].status = Status.CONCLUIDO
            println("A tarefa $id foi feita, continue se empenhando para finalizar toda a sua lista.")
        }else {
            println("Tarefa não encontrada ou já realizada.")
        }
    }

    private fun validarSeEPermitidoMarcarComoConcluido(index: Int, lista: MutableList<Tarefa>) =
        index != -1 && lista[index].status != Status.CONCLUIDO
}