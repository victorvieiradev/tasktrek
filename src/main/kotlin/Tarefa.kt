package org.example

import java.util.UUID

data class Tarefa(
    val id: UUID,
    val titulo: String,
    val descricao: String,
    val status: Status = Status.PENDENTE
){
    override fun toString(): String {
        return "Tarefa(id=$id, titulo='$titulo', descricao='$descricao', status=$status)"
    }
}