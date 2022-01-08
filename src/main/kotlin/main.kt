fun main() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0),
    )

    println(pedidos)

    // associate

    //val pedidosMapeado = pedidos.associate { pedido: Pedido -> Pair(pedido.numero, pedido) }
    val pedidosMapeado = pedidos.associate { pedido: Pedido -> pedido.numero to pedido }
    println(pedidosMapeado)
    println(pedidosMapeado[1])

    // associateBy

    val pedidosMapeadoComAssociateBy = pedidos.associateBy { pedido: Pedido -> pedido.numero }
    println(pedidosMapeadoComAssociateBy)

    // associateWith

    val pedidosFreteGratis = pedidos.associateWith { pedido -> pedido.valor > 50.0 }
    println(pedidosFreteGratis)
    println(pedidosFreteGratis[Pedido(1, 20.0)])
    println(pedidosFreteGratis[Pedido(2, 60.0)])

    /**
     * Utilizando o agrupamento
     */

    //val mapa = pedidos.associateBy { pedido -> pedido.valor > 50.0 } // problema para ser resolvido com o groupBy
    //println(mapa)

    // groupBy

    val pedidosFreteGratisAgrupados: Map<Boolean, List<Pedido>> = pedidos.groupBy { pedido -> pedido.valor > 50 }
    println(pedidosFreteGratisAgrupados)
    println(pedidosFreteGratisAgrupados[true])
    println(pedidosFreteGratisAgrupados[false])

    val nomes = listOf("João Pedro", "Andressa", "Mariana", "Sandra", "Isaias", "Caique", "Caua", "Josué")

    val agenda = nomes.groupBy { nome -> nome.first() }
    println(agenda)
    println(agenda['C'])
    println(agenda['J'])
}

data class Pedido(val numero: Int, val valor: Double)



