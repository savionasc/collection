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

    println("-----------------\nSalários maiores que 2500:")

    salariosMaiorQue2500.forEach{ println(it) }

    println("-----------------\nContando a quantidade de salários entre 2000 e 5000:")
    println(salarios.count{ it in 2000.0..5000.0 })

    println("-----------------\nBuscando elemento específico no array")
    println(salarios.find { it == 4000.0 })
    println(salarios.find { it == 2500.0 })

    println("-----------------\nDescobrindo existência de elemento específico no array")
    println(salarios.any { it == 4000.0 })
    println(salarios.any { it == 2500.0 })
}