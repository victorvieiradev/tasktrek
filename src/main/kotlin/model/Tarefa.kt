package org.example.model

import org.example.enums.Status
import org.example.enums.Prioridade
import java.util.UUID

data class Tarefa(
    val id: UUID,
    var titulo: String,
    var descricao: String,
    var prioridade: Prioridade = Prioridade.BAIXA,
    var status: Status = Status.PENDENTE
) {
    override fun toString(): String {
        return "id: $id, titulo: '$titulo', descricao: '$descricao', prioridade: $prioridade, status: $status \n"
    }
}