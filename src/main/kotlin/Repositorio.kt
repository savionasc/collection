class Repositorio<T> {
    private val map = mutableMapOf<String, T>()

    fun create(id: String, value: T) {
        //map.put(id, value)
        map[id] = value
    }

    fun findById(id: String) = map[id]

    fun remove(id: String) = map.remove(id)

    fun findAll() = map.values
}