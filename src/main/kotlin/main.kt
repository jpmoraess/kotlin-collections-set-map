fun main() {
    val pedidos = mutableMapOf<Int, Double>(
        Pair(1, 2.0),
        Pair(2, 34.20),
        3 to 25.34
    ) // to -> infix function

    // quando a performance for necessária, usar infix function pode não ser uma boa opção...

    println(pedidos)

    val pedido = pedidos[2]

    pedido?.let {
        println("pedido: $it")
    }

    for (p: Map.Entry<Int, Double> in pedidos) {
        println("--------------------------------")
        println("número do pedido: ${p.key}")
        println("valor do pedido: ${p.value}")
    }

    /**
     * Trabalhando com escrita...
     */

    pedidos[4] = 36.20
    println(pedidos)
    pedidos.put(5, 80.20)
    println(pedidos)
    pedidos[5] = 29.30
    println(pedidos)
    pedidos.putIfAbsent(6, 320.20) // putIfAbsent, adiciona elementos apenas quando a chave não existir.
    println(pedidos)
    pedidos.putIfAbsent(6, 509.20)// putIfAbsent, adiciona elementos apenas quando a chave não existir.

    pedidos.remove(6)
    println(pedidos)
    pedidos.remove(3)
    println(pedidos)
    pedidos.remove(1, 2.0) // a remoção passando o 2° parametro só ocorre quando o valor informado for correspondente...
    println(pedidos)
}


