package org.example

class MenuTarefa(
    private val criarTarefa: CriarTarefa
) {
    fun exibirMenuCriarTarefa(): Tarefa {
        println("Digite o título da tarefa:")
        var titulo = readLine().orEmpty().trim()

        while (titulo.isBlank()) {
            println("Título não pode estar em branco. Por favor, digite novamente:")
            titulo = readLine().orEmpty().trim()
        }

        println("Digite a descrição da tarefa:")
        var descricao = readLine().orEmpty().trim()

        while (descricao.isBlank()) {
            println("Descrição não pode estar em branco. Por favor, digite novamente:")
            descricao = readLine().orEmpty().trim()
        }
        return criarTarefa.criar(titulo, descricao)
    }


}

