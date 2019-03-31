fun maxOf(a: Int, b: Int): Int {
    return if (a > b) {
        a
    } else {
        b
    }
}

fun main() {
    println("max of 0 and 42 is ${maxOf(0, 42)}")
}

//fun maxOf(a: Int, b: Int) = if (a > b) a else b
