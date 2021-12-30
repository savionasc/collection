fun main() {
    val nomes = Array(3){""}
    nomes[0] = "Savio"
    nomes[1] = "Nascimento"
    nomes[2] = "Antonio"

    for(nome in nomes){
        println(nome)
    }

    println("---------------")
    nomes.sort()

    nomes.forEach {
        println(it)
    }

    var meuArray = arrayOf("Teste", "Teeste2", "Testeee")
    println("---------------")
    meuArray.forEach {
        println(it)
    }
}