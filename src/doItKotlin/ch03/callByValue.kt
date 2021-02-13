package doItKotlin.ch03

fun main() {
    val result = callByValue(lambda())
    println(result)
}

fun callByValue(b: Boolean): Boolean {
    println("call by value function")
    return b
}

val lambda: () -> Boolean = {
    println("lamda function")
    true
}