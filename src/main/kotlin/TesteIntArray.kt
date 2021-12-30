fun main() {
    val values = IntArray(5)
    values[0] = 1
    values[1] = 5
    values[2] = 2
    values[3] = 3
    values[4] = 4

    for(valor in values){
        println(valor)
    }

    //values.forEach { x ->
    //    println(x)
    //}
    println("---------------")
    values.forEach {
        println(it)
    }

    println("---------------")
    values.sort()
    for (index in values.indices){
        println(values[index])
    }
}