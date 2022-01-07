fun main() {

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
}

