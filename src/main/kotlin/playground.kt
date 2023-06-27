class Student {
    val studentName: String = "Harry"
}

class StudentCompanion {
    companion object {
        val studentName: String = "Harry"
    }
}

fun main() {
    val name = Student()
    println(name.studentName)
    println(StudentCompanion.studentName)
}