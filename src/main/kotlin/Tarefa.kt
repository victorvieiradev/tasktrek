package org.example

import java.util.UUID

data class Tarefa(
    val id: UUID,
    var titulo: String,
    var descricao: String,
    val status: Status = Status.PENDENTE
){
    override fun toString(): String {
        return "Tarefa(id=$id, titulo='$titulo', descricao='$descricao', status=$status)"
    }
}