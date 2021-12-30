fun main() {
    val savio = Funcionario("Sávio", 5000.0, "CLT")
    val antonio = Funcionario("Antonio", 10000.0,"PJ")
    val nascimento = Funcionario("Nascimento", 4500.0, "CLT")

    val funcionarios = listOf<Funcionario>(savio, antonio, nascimento)

    funcionarios.forEach{
        println(it)
    }

    println("Funcionário encontrado:")
    println(funcionarios.find { funcionario -> funcionario.nome == "Sávio" })
    println("Ordenado por salário:")
    funcionarios.sortedBy { it.salario }.forEach{ println(it) }
    println("Ordenado por Nome:")
    funcionarios.sortedBy { it.nome }.forEach{ println(it) }
    println("Agrupado por Tipo de Contratação:")
    funcionarios.groupBy { it.tipoContratacao }.forEach{ println(it) }
}