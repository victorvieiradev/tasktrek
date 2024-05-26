package org.example.casosdeuso

import org.example.enums.Prioridade
import org.example.model.Tarefa
import java.util.*

class DefinirPrioridade {
    fun definir(id: UUID, prioridade: Prioridade, lista: MutableList<Tarefa>): String {
        val indiceDaTarefa = lista.indexOfFirst { it.id == id }
        if (indiceDaTarefa == -1) {
            return "Tarefa não encontrada."
        }
        if (lista[indiceDaTarefa].prioridade == prioridade) {
            return "A prioridade informada ${prioridade.name}, já está definida."
        }
        lista[indiceDaTarefa].prioridade = prioridade
        return "A prioridade foi definida para ${lista[indiceDaTarefa].prioridade.name}"


    }
}