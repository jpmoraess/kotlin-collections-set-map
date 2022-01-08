fun main() {
    val pedidos = mapOf<Int, Double>(Pair(1, 2.0), Pair(2, 34.20), 3 to 25.34) // to -> infix function

    // quando a performance for necessária, usar infix function pode não ser uma boa opção...

    println(pedidos)

    val pedido = pedidos[2]

    pedido?.let {
        println("pedido: $it")
    }

    for (pedido: Map.Entry<Int, Double> in pedidos) {
        println("--------------------------------")
        println("número do pedido: ${pedido.key}")
        println("valor do pedido: ${pedido.value}")
    }
}


