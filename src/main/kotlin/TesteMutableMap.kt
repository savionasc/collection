fun main() {
    val savio = Funcionario("Savio", 8000.0, "CLT")
    val nascimento = Funcionario("Nascimento", 9000.0, "PJ")
    val antonio = Funcionario("Antonio", 7000.0, "CLT")

    val repositorio = Repositorio<Funcionario>()

    repositorio.create(savio.nome, savio)
    repositorio.create(nascimento.nome, nascimento)
    repositorio.create(antonio.nome, antonio)

    println(repositorio.findById("Savio"))
    println(repositorio.findById(nascimento.nome))

    repositorio.remove("Nascimento")

    println("Todos:")
    repositorio.findAll().forEach{ println(it) }
}