fun main() {
    val values = intArrayOf(3, 2, 5)

    values.forEach {
        println(it)
    }

    println("------------------------")
    values.sort()
    values.forEach {
        println(it)
    }
}