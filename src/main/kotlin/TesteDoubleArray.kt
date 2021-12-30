fun main() {
    val salarios = DoubleArray(3)
    salarios[0] = 1000.0
    salarios[1] = 2500.0
    salarios[2] = 3000.0

    salarios.forEach { println(it) }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 1.1
    }

    val salarios2 = doubleArrayOf(500.0, 800.0, 1000.0)
    salarios2.forEach { println(it) }
}