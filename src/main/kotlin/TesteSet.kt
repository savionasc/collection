fun main() {
    val savio = Funcionario("Savio", 8000.0, "CLT")
    val nascimento = Funcionario("Nascimento", 9000.0, "PJ")
    val antonio = Funcionario("Antonio", 7000.0, "CLT")

    val funcionario1 = setOf<Funcionario>(savio, nascimento)
    val funcionario2 = setOf(antonio)
    val funcionario3 = setOf(antonio, savio, nascimento)

    println("Union:")
    val resultUnion = funcionario1.union(funcionario2)
    resultUnion.forEach{ println(it) }

    println("Subtração:")
    val resultSubtract = funcionario3.subtract(funcionario1)
    resultSubtract.forEach{ println(it) }

    println("Interseção:")
    val resultIntersect = funcionario3.intersect(funcionario1)
    resultIntersect.forEach{ println(it) }
    println("Interseção Nula:")
    val resultIntersectNull = funcionario1.intersect(funcionario2)
    resultIntersectNull.forEach{ println(it) }
}