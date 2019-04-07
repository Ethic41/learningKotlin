import java.util.*

//Author: Dahir Muhammad Dahir
//Date: 02-04-2019 03:29 PM

class Invoice {
    //this is a valid class declaration
}

class EmptyClass //this is also valid class

class Person1 constructor(val firstName: String){
    //body of class will be here
    init {
        val userName = firstName
    }
}

class InitOrderDemo(name: String){
    val firstProperty = "First property: $name"//.also(::println)

    init {
        println("first initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}"//.also(::println)

    init {
        println("second initializer block that prints ${name.length}")
    }
}

class Person(val name: String) {
    constructor(name: String, parent: Person) : this(name) {
        //do nothing
    }
}

open class Parent(p: Int){
    //this is a parent class
}

class Child(p: Int) : Parent(p){
    // this is a child of the Parent class
}

//overriding class
open class Base {
    open fun v(){
        //empty fun
    }

    fun nv(){

    }
}

class Derived(): Base(){
    override fun v(){

    }
}

//prohibit overriding
class Derived2(): Base(){
    final override fun v() {
        //
    }
}

//overriding properties
open class Foo {
    open val x: Int = 23
}

class Bar1 : Foo() {
    override val x: Int = 24
}
// simple class declaration with constructor
class Person2 constructor(val firstName: String, val lastName: String, var age: Int?){
    //empty body
}

class Person3 constructor(val firstName: String, val lastName: String, val age: Int?){
    init {
        require(firstName.trim().isNotEmpty()) { "Invalid firstName" }
        require(lastName.trim().isNotEmpty()) { "Invalid LastName" }
        when {
            age != null -> require(age in 0..149) { "Invalid age argument" }
        }
    }
}

/* secondary constructor */
class Person4 constructor(val firstName: String, val lastName: String, val age: Int?){
    constructor(firstName: String, lastName: String) : this(firstName, lastName, null)
}

class Person5(firstName: String, lastName: String, age: Int?) {
    private val name: String = "$firstName $lastName"
    private val howOld: Int? = age

    fun getName(): String = this.name

    fun getAge(): Int? = this.howOld

}

class BasicGraph(val name: String){
    class Line(val x1: Int, val y1: Int, val x2: Int, val y2: Int){
        fun draw(){
            println("Drawing Line from ($x1:$y1) to ($x2:$y2)")
        }
    }

    fun draw(){
        println("Drawing the Graph $name")
    }
}

class BasicGraphWithInner(val graphName: String){
    private val name: String = graphName

    inner class Line(val x1: Int, val y1: Int, val x2: Int, val y2: Int){
        fun draw(){
            println("Drawing Line from ($x1:$y1) to ($x2:$y2) for graph $name")
        }
    }

    fun draw(){
        println("Drawing the graph $name")
    }
}

//enum class

enum class Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}

enum class Planet (val mass: Double, val radius: Double){
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37813e6),
    MARS(6.421e+23, 3.3972e6),
    JUPITER(1.9e+27, 7.1492e7),
    SATURN(5.688e+26, 6.0268e7),
    URANUS(8.686e+25, 2.5559e7),
    NEPTUNE(1.024e26, 2.4746e7)
}

//Inheritance
enum class CardType {
    VISA, MASTERCARD, VERVE, AMEX, FIRST_INSTANCE
}

open class Payment(val amount: Long){
    //Body of class here
}

class CardPayment(amount: Long, val cardNumber: String, val expiryDate: Date, val type: CardType) : Payment(amount) {
    //implement CardPayment here
}

class ChequePayment: Payment {

    private val name: String
    private val bankId: String

    constructor(amount: Long, name: String, bankId: String) : super(amount){
        this.name = name
        this.bankId = bankId
    }

}

interface Drivable {
    fun drive()
}

interface Sailable {
    fun sail()
}

class AmphibiousCar(val name: String): Drivable, Sailable{
    override fun drive(){
        println("Driving")
    }

    override fun sail(){
        println("Sailing")
    }
}

abstract class Shape protected constructor(){
    var xLocation: Int = 0
    var yLocation: Int = 0
    
    var width: Double = 0.0
    var height: Double = 0.0

    abstract fun isHit(x: Int, y: Int): Boolean
}

class Ellipsis : Shape() {
    override fun isHit(x: Int, y: Int): Boolean {
        val xRadius = width
        val yRadius = height
        val centerX = xLocation + xRadius
        val centerY = yLocation + yRadius
        if (xRadius == 0.0 || yRadius == 0.0)
            return false
        val normalizedX = centerX - xLocation
        val normalizedY = centerY - yLocation
        return (normalizedX * normalizedX) / (xRadius * xRadius) + (normalizedY * normalizedY) / (yRadius * yRadius) <= 1.0
    }
}

class Rectangle : Shape() {
    override fun isHit(x: Int, y: Int): Boolean {
        return x >= xLocation && x <= (xLocation + width) && y >= yLocation && y <= (yLocation + height)
    }
}

fun main(){
    val e1 = Ellipsis()
    val e2 = Ellipsis()
    val r1 = Rectangle()
    val pay = CardPayment(100_000, "9999-9999-9999-9999", Date(2012),  CardType.MASTERCARD)
    val man1 = Person1("Mustapha Murnai")
    println(man1.firstName)
    val someOrder = InitOrderDemo("Omen Laptop")
    println(someOrder.firstProperty)
    println(someOrder.secondProperty)
    val man2 = Person2("Dahir", "Muhammad", 23)
    println("My Name is ${man2.firstName} ${man2.lastName} and I am ${man2.age} years old")
    val man3 = Person2("Mustapha", "Murnai", null)
    println("And I am ${man3.firstName} ${man3.lastName}, ${man3.age?.toString() ?: '?'} years old")
    val man4 = Person3("Tahir", "Muhammad Tahir", 23)
    println("My name is ${man4.firstName} ${man4.lastName} age: ${man4.age}")
    val man5 = Person4("Aisha", "Muhammad")
    println("My name is ${man5.firstName} ${man5.lastName}")
    val man6 = Person5("Muhammad", "Tahir", 23)
    println("${man6.getName()} is ${man6.getAge()}")
    val line = BasicGraph.Line(1, 0, -1, 2)
    line.draw()
    val newLine = BasicGraphWithInner("Inner Simple Graph")
    newLine.draw()
    newLine.Line(1,2, -2,3).draw()
    val home = Planet.EARTH
}