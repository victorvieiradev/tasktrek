package org.example

import java.util.*

class CriarTarefa {
    fun criar(titulo: String, descricao: String) = Tarefa(
        id = UUID.randomUUID(),
        titulo = titulo,
        descricao = descricao,
        status = Status.PENDENTE
    )
}
