import kotlin.math.*

// TODO: Typed variable declarations
// TODO: Type inference
// TODO: Mutable variables
// TODO: Immutable variable

fun getAreaOfCircle(radius: Double) {
    val pi = 3.1415926 // immutable variable + type inference
    var area = pi*radius.pow(2) // mutable variable + type inference
    var printResult: String = "Circle with radius of $radius has area of $area" // typed variable declarations
    println(printResult)
}

fun main() {
    getAreaOfCircle(10.5)
}

// TODO: What is Immutability, why is it good?
/*
Once an object is created, its properties and values cannot be modified
Can share freely between different threads with no risk of running into race conditions
Immutable collection implementations are always more memory-efficient than their mutable alternatives
Great defensive programming technique - ensuring we don't make unwanted changes to our data
 */