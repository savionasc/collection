fun main() {
    val savio = Funcionario("Savio", 8000.0, "CLT")
    val nascimento = Funcionario("Nascimento", 9000.0, "PJ")
    val antonio = Funcionario("Antonio", 7000.0, "CLT")

    println("Usando listas mutáveis")
    val funcionarios = mutableListOf(savio, antonio)
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.add(nascimento)
    funcionarios.forEach { println(it) }

    println("------------------")
    funcionarios.remove(savio)
    funcionarios.forEach { println(it) }

    println("Usando conjuntos mutáveis")
    val funcionarioSet = mutableSetOf(savio)
    funcionarioSet.forEach { println(it) }

    println("------------------")
    funcionarioSet.add(nascimento)
    funcionarioSet.add(antonio)
    funcionarioSet.forEach { println(it) }

    println("------------------")
    funcionarioSet.remove(antonio)
    funcionarioSet.forEach { println(it) }
}