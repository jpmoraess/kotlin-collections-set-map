fun main() {
    val nomes: Collection<String> = setOf("João Pedro", "Andressa", "Sandra", "Mariana")

    for (nome in nomes) println(nome)

    println(nomes)

    println("Tem o nome João Pedro ? ${nomes.contains("João Pedro")}")

    println("Tamanho da coleção: ${nomes.size}")
}