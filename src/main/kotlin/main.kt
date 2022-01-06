fun main() {
    val banco = BancoDeNomes()

    val nomesSalvos = banco.nomes

    //banco.nomes.add("João Pedro")
    banco.salva("João Pedro")

    println(nomesSalvos)

    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf("João Pedro", "Andressa", "Sandra", "Mariana")

    for (nome in nomes) println(nome)

    println(nomes)

    println("Tem o nome João Pedro ? ${nomes.contains("João Pedro")}")

    println("Tamanho da coleção: ${nomes.size}")
}