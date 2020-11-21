package tutorial.introduction.functions

fun printMessage(message: String): Unit {
    println(message)
}

fun printMessageWithPrefix(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun multiply(x: Int, y: Int) = x * y

fun main() {
    printMessage("Hello")
    printMessageWithPrefix("Hello", "Log")
    printMessageWithPrefix("Hello")
    printMessageWithPrefix(prefix = "Log", message = "Hello")
    println(sum(1, 2))
    println(sum(x = 1, y = 2))
    println(multiply(2, 4))
    println(multiply(x = 2, 4))
//    println(multiply(y = 2, 4)) >> 요건 안된다.
    println(multiply(y = 2, x = 4))
}
