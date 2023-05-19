import kotlin.math.round
import example.*

// TODO: Understanding of what parameters are
// Names listed in the function's definition, defined using Pascal notation - nameL type. Each parameter must be explicitly typed.

// TODO: Understanding of what return values are
// Functions with block body must specify return types explicitly unless it's intended for them to return Unit.
fun convertLbToKg(pound: Double): List<Any> {
    val kg = round(pound/2.205)
    println("$pound lb is $kg kg.")
    return listOf("kg", kg)
}

// use List<Any> for multiple values of any type, array for up to 5 values of the same type (if set to variable)

// TODO: Understanding of Unit / Void functions
// Default return type if a function does not return a useful value - does not have to be returned explicitly

// TODO: Understanding of type signatures of functions (String) -> Unit for example


// TODO: Named arguments vs positional arguments
/*
Positional arguments: method arguments that must be passed in the same order they are declared
Can be confusing as the number of parameters increases, can instead name one of more arguments.
*/

// TODO: Default values for arguments
//Function parameters can have default values, which are used when you skip the corresponding argument.
fun printWeather(forecastToday: String = "rain", forecastTomorrow: String = "rain") {
    println("function with default")
    println("Today's forecast: $forecastToday. Tomorrow's forecast: $forecastTomorrow.")
}

//fun printWeather(forecast: String,  date: String) {
//    println("function without default")
//    printWeather("snow")
//}

// TODO: Infix notation and operator functions
// can be called without period and brackets, e.g. to() in the inline Map definition -> more natural and readable code
// Requirements: must be member functions or extension functions, must have a single parameter, parameter must not accept variable number of arguments and must have no default value
fun printStock(product: String) {
    var stock = mapOf("coke" to (5 add 10), "pepsi" to 5)
    println("$product stock: ${stock.get(product)}")
}


fun main() {
//    convertLbToKg(100.00)
//    println("default arguments")
//    printWeather()
//    println("positional arguments")
//    printWeather("sunny", "snow")
//    println("named arguments")
//    printWeather(forecastTomorrow = "hail", forecastToday = "sunny")
    printStock("coke") // infix
    printStock("pepsi")
}