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

}

data class Pedido(val numero: Int, val valor: Double)



