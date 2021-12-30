fun main() {
    val salarios = doubleArrayOf(2000.0, 1500.0, 4000.0)

    salarios.forEach { salario ->
        println(salario)
    }

    println("-----------------")
    println("Maior salário: ${salarios.maxOrNull()}")
    println("Menor salário: ${salarios.minOrNull()}")
    println("Média salário: ${salarios.average()}")

    val salariosMaiorQue2500 = salarios.filter { it > 2500.0 }

    println("-----------------")

    salariosMaiorQue2500.forEach{ println(it) }
}