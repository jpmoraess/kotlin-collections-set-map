fun testaSet() {
    val assistiramCursoKotlin: Set<String> = setOf("João Pedro", "Mariana", "Bruna")

    val assistiramCursoAndroid: Set<String> =
        setOf("João Pedro", "Andressa", "Mariana", "Isaias", "Bruna", "Fernando")

    //val assistiramAmbos = assistiramCursoAndroid + assistiramCursoAndroid // a ordem importa.. -> retorna um list

    //val assistiramAmbos = assistiramCursoKotlin + assistiramCursoAndroid // retorna um set

    val assistiramAmbos = mutableSetOf<String>()
    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    assistiramAmbos.add("João Pedro")
    assistiramAmbos.add("Caique")

    println(assistiramAmbos)


    println(assistiramCursoAndroid + assistiramCursoKotlin)
    println(assistiramCursoAndroid.union(assistiramCursoKotlin))
    println(assistiramCursoAndroid union (assistiramCursoKotlin)) // infix..
    println(assistiramCursoAndroid union assistiramCursoKotlin) // infix..

    println(assistiramCursoAndroid - assistiramCursoKotlin)
    println(assistiramCursoAndroid subtract assistiramCursoKotlin) // infix

    println(assistiramCursoAndroid intersect assistiramCursoKotlin)

    val assistiramList = assistiramAmbos.toMutableList()
    assistiramList.add("João Pedro")
    println(assistiramList)
    println(assistiramList.toSet())
}