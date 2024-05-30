package org.example.util

import java.util.*

class EntradaUUID {
    private val scanner = Scanner(System.`in`)

    fun solicitarUUID(): UUID? {
        while (true) {
            println("Digite um ID no formato UUID ou '0' para sair:")
            val entrada = scanner.nextLine()

            if (entrada == "0") {
                println("Saindo...")
                return null
            }

            try {
                val uuid = UUID.fromString(entrada)
                println("UUID válido fornecido: $uuid")
                return uuid
            } catch (e: IllegalArgumentException) {
                println("ID inválido, por favor tente novamente.")
            }
        }
    }
}

