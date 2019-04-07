import java.lang.IllegalArgumentException

// Author: Dahir Muhammad Dahir
// Date: 31-03-2019 08:19 PM

fun foo(a: Int = 0, b: String = ""): String{
    return "a is $a and b is $b"
}

val list = listOf(-1,-2,-3,-4,-5, 1, 2, 4, 5, 6)

fun transform(color: String): Int {
    return when (color){
        "Red" -> 0
        "Blue" -> 1
        "Green" -> 2
        else -> throw IllegalArgumentException("Invalid color param")
    }
}

fun main(){
    val testFoo = foo(2, "love")
    println(testFoo)
    println(list.filter { it % 2 == 0 })

    for (i in 1..10){
        println(i)
    }

    for (i in 1 until 10){
        println(i)
    }

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map["d"] = 4
    println(map)

    println(transform("Red"))

}




