package org.example.casosdeuso

import org.example.Status
import org.example.Tarefa
import java.util.*

class CriarTarefa {
    fun criar(titulo: String, descricao: String) = Tarefa(
        id = UUID.randomUUID(),
        titulo = titulo,
        descricao = descricao,
        status = Status.PENDENTE
    )
}
