fun main() {
    val pedidos: MutableMap<Int, Double> = mutableMapOf<Int, Double>(
        Pair(1, 2.0),
        Pair(2, 34.20),
        3 to 25.34,
        4 to 100.0,
        5 to 150.0,
        6 to 80.0
    ) // to -> infix function

    val valorPedido = pedidos.get(6)
    println(valorPedido)

    // val valorPedidoX = pedidos.getValue(6)
    // println(valorPedidoX)

    println(pedidos.getOrElse(22) { "Não tem o pedido" })

    println(pedidos.getOrDefault(12, -1.0))
    println(pedidos.getOrDefault(1, -1.0))

    println(pedidos.keys)

    for (numero in pedidos.keys) {
        println("pedido: $numero")
    }

    println(pedidos.values)

    for (valor in pedidos.values) {
        println("valor: $valor")
    }

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        numero % 2 == 0 && valor > 50.0
    }

    println(pedidosFiltrados)

    val pedidosAcima = pedidos.filterValues { valor ->
        valor > 70.0
    }

    println("pedidos acima de 70: $pedidosAcima")

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }

    println("pedidos pares: $pedidosPares")
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
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


