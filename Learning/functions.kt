//various ways of defining functions
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun newSum(a: Int, b: Int) = a + b

fun printSum(a: Int, b: Int) {
    println("sum of $a and $b is ${a + b}")
}

fun main() {
    print("Sum of 3 and 5 is ")
    println(sum(3, 5))
    println("sum of 19 and 23 is ${newSum(19, 23)}")
    printSum(3, 5)
}