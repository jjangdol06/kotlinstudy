package doItKotlin.ch03

fun main() {
    val result = callByName(otherLambda)
    println(result)
}

fun callByName(b: () -> Boolean): Boolean {
    println("call by name function")
    return b()
}

val otherLambda: () -> Boolean = {
    println("other lambda function")
    true
}