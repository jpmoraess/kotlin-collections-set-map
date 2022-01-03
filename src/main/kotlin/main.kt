fun main() {
    val banco = BancoDeNomes()

    //banco.nomes.add("João Pedro")
    banco.salva("João Pedro")

    println(banco.nomes)

    println(BancoDeNomes().nomes)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados

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