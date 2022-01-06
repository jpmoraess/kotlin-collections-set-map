fun main() {

    val assistiramCursoKotlin = listOf("João Pedro", "Mariana", "Bruna")
    val assistiramCursoAndroid = listOf("João Pedro", "Andressa", "Mariana", "Isaias", "Bruna", "Fernando")

    val assistiramAmbos = mutableListOf<String>()
    //val assistiramAmbos2 = assistiramCursoKotlin + assistiramCursoAndroid // a ordem importa..

    assistiramAmbos.addAll(assistiramCursoAndroid)
    assistiramAmbos.addAll(assistiramCursoKotlin)

    println(assistiramAmbos.distinct())
}

