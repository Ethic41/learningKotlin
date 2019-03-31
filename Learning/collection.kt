//collection

fun main() {
    val items = listOf("Binya", "tahir", "Usman")
    for (item in items) {
        println(item)
    }
    checkWhen()
}

fun checkWhen() {
    val items = listOf("apple", "orange", "carrot")
    when {
        "orange" in items -> println("Juicy")
        "apple" in items -> println("apple is fine too")
    }
    lamda()
}

fun lamda() {
    val fruits = listOf("Banana", "avocado", "apple", "kiwi")
    fruits
            .filter { it.startsWith("a") }
            .sortedBy { it }
            .map { it.toUpperCase() }
            .forEach { println(it) }
}
