package kotlinInAction

import java.util.*

val binaryReps = TreeMap<Char, String>()
val list = arrayListOf("10", "11", "!2")

fun main() {
    for (c in 'A'..'F') {
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary  // java : binaryReps.put(c, binary)
    }

    for ((letter, binary) in binaryReps) {
        println("${letter} = ${binary}")
    }

    for ((index, element) in list.withIndex()) {
        println("${index} : ${element}")
    }
}

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a character"
    else -> "I don't know"
}