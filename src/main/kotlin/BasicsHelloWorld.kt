package basics
import java.util.Scanner

// TODO: Understanding of what the entry point for an application is
// An entry point of a Kotlin application is the main function
// To compile the application using the Kotlin compiler: kotlinc hello.kt -include-runtime -d hello.jar
// To run the application: java -jar hello.jar
fun main() {
    printToStandardOutput("I'm printing to standard output!")
    printNewLineToStandardOutput("The next line will be a new line!")
    printNewLineToStandardOutput("Hello World!")
    getName()
    getAge()
}
// TODO: Understanding of how to write to standard output.
fun printToStandardOutput(toPrint: String) {
    print(toPrint)
}
fun printNewLineToStandardOutput(toPrint: String) {
    println(toPrint)
}
// TODO: Understanding of what standard output is.
/*
stdout - a stream to which a program writes its output data.
stdin - a stream from which a program reads its input data.
stderr - a stream typically used by programs to output error messages or diagnostics, independent of standard output and can be redirected separately.
*/
fun getName() {
    println("What's your name?")
    val name = readLine()
    if (name != null) {
        if (name.length > 1) {
            println("Your name is $name")
        } else {
            System.err.println("Name must have a length greater than 1.")
            getName()
        }
    }
}

fun getAge() {
    val input = Scanner(System.`in`)
    println("How old are you?")
    var age = input.nextInt()
    println("You are $age years old")
}
// TODO: Understanding of packages and the default behaviour
/*
A Kotlin project is structured into packages. A package contains one or more Kotlin files, with files linked to a package using a package header.
In order to use an entity form a file belong to a different package, you have to import them.
Some packages are imported into every Kotlin file by default: e.g. kotlin.* -> core functions and types, kotlin.annotation.* -> library support for Kotlin annotation facility
Wildcard * can be used to import all classes from a package
*/