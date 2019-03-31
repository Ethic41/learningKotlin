//for loops
fun main() {
    val items = listOf("rock", "paper", "scissors")
    for (item in items) {
        println(item)
    }
    loopIndex()
}

fun loopIndex() {
    val items = listOf("tahir", "phaux", "Raliya")
    for (item in items.indices) {
        println("Positions: $item ==> ${items[item]}")
    }
    loopWhile()
}

//while loops
fun loopWhile() {
    val items = listOf("an", "at", "am")
    var index = 0
    while (index < items.size) {
        println("item at $index is ${items[index]}")
        index++

    }
}
