//Author: Dahir Muhammad Dahir
//Date: 01-04-2019 01:50 PM

fun main(){
    //Numbers
    val decimalNumber = 123
    val longNumber = 123L
    val hexNumber = 0x0F
    val binaryNumber = 0b00001011
    val doubleNumber = 123.5
    val floatNumber = 123.5f

    println("decimalNumber: $decimalNumber, longNumber: $longNumber, hexNumber: $hexNumber, binaryNumber: $binaryNumber, doubleNumber: $doubleNumber, floatNumber: $floatNumber")

    //for readability of numbers
    val oneMillion = 1_000_000
    val creditCardNumber = 1234_5678_9012_3456L
    val socialSecurityNumber = 999_99_9999L
    val hexBytes = 0xDE_AD_BE_EF
    println("oneMillion: $oneMillion, creditCardNumber: $creditCardNumber, socialSecurityNumber: $socialSecurityNumber, hexBytes: $hexBytes")

    //bitwise operations
    val x = (1 shl 2) and 0x000FF000 shr 2 or 3 xor 4
    println(x)

    //Arrays
    val numArrays = arrayOf(1,3,5,7,6)
    numArrays[4] = 5
    println(numArrays.contentToString())

    //Strings
    val s = "abc" + 1
    println(s+"def")

    //raw strings
    val text = """
        for (c in "foo"){
            print(c)
        }
    """.trimIndent()

    println(text)

    // for loop
    val smallArray = 1..20
    loop@for ((index, value) in smallArray.withIndex()){
        println("the element at $index is $value")
        //if (index > 15) break // or continue will all work here
        when {
            index > 15 -> continue@loop
            else -> println("wasn't skipped")
        }
    }


    val first = 12
    val second = 13
    println("i am $first and i am $second")

}
