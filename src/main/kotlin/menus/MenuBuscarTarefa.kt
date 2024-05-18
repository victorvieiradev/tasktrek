package org.example.menus

import org.example.BuscadorTarefa
import org.example.Tarefa
import java.util.*

class MenuBuscarTarefa(
    private val buscadorTarefa: BuscadorTarefa,
    private val scanner: Scanner = Scanner(System.`in`)
) {


    fun executar(lista: MutableList<Tarefa>) {
        var continuar = true

        while (continuar) {
            println("Digite o termo de pesquisa:")
            val termoPesquisa = scanner.nextLine()

            buscadorTarefa.buscar(
                pesquisa = termoPesquisa,
                lista = lista
            )

            println("Deseja fazer outra pesquisa? (s/n)")
            val resposta = scanner.nextLine()

            if (resposta.equals("n", ignoreCase = true)) {
                continuar = false
                println("Fechando busca...")
            }
        }

    }

}

