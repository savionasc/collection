fun main() {
    val pair: Pair<String, Double> = Pair("Savio", 5000.0)
    val map1 = mapOf(pair)

    map1.forEach{ k, v -> println("O Cliente ${k} recebe ${v} de salário") }

    map1.forEach{ (k, v) -> println("O Cliente $k recebe $v de salário") }

    //Infix Kotlin
    val map2 = mapOf(
        "Savio" to 2000.0,
        "Savio2" to 3000.0
    )
}