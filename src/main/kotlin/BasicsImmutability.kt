data class User (val id: String, val name: String, val age: Int, val email: String) {
    override fun toString(): String {
        return "User${id} - name: ${name}, age: ${age}, email: $email"
    }
}

data class MutableUser (var id: String, var name: String, var age: Int, var email: String) {
    override fun toString(): String {
        return "User${id} - name: ${name}, age: ${age}, email: $email"
    }
}

fun main() {
    val user1 = User("1", "John Smith", 20, "john.smith@autotrader.co.uk")
    user1.name = "Andy Smith"
    user1 = User("2", "Tom Smith", 2, "tom.smith@autotrader.co.uk")
    println(user1)

    var user2 = User("2", "John Smith", 20, "john.smith@autotrader.co.uk")
    user2 = User("2", "Tom Smith", 2, "tom.smith@autotrader.co.uk")
    user2.name = "Andy Smith"
    println(user3)

    var user3 = MutableUser("3", "Tom Smith", 20, "tom.smith@autotrader.co.uk")
    println(user3)
    user3.name = "Andy Smith"
    println(user3)
    user3 = MutableUser("3", "Anonymous Smith", 20, "john.smith@autotrader.co.uk")
    println(user3)
}