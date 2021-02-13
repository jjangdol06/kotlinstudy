package kotlinInAction

import java.lang.Exception

enum class Color(val r: Int, val g: Int, val b: Int) {
    RED(255, 0, 0),
    ORANGE(255, 165, 0),
    YELLOW(255, 255, 0),
    GREEN(0, 255, 0),
    BLUE(0, 0, 255),
    INDIGO(75, 0, 130),
    VIOLET(238, 130, 238);

    fun rgb() = (r * 256 + g) * 256 + b
}

fun getMnemonic(color: Color) =
    when (color) {
        Color.RED -> "Richard"
        Color.ORANGE -> "Of"
        Color.YELLOW -> "York"
        Color.GREEN -> "Gave"
        Color.BLUE -> "Battle"
        Color.INDIGO -> "In"
        Color.VIOLET -> "Vain"
    }

fun getWarmth(color: Color) =
    when (color) {
        Color.RED, Color.ORANGE, Color.YELLOW -> "warm"
        Color.GREEN -> "neutral"
        Color.BLUE, Color.INDIGO, Color.VIOLET -> "cold"
    }

// 자주 호출 시 garbage 객체가 많이 생성된다
fun mix(c1: Color, c2: Color) =
    when (setOf(c1, c2)) {
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.BLUE, Color.YELLOW) -> Color.GREEN
        else -> throw Exception("no mix found")
    }

// 불편함 감수 -> 인자 없는 when : 각 분기의 조건이 Boolean 결과를 계산하는 식이어야 한다.
fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == Color.RED && c2 == Color.YELLOW) || (c1 == Color.YELLOW && c2 == Color.RED)
        -> Color.ORANGE
        (c1 == Color.YELLOW && c2 == Color.BLUE) || (c1 == Color.BLUE && c2 == Color.YELLOW)
        -> Color.GREEN
        else -> throw Exception("no mix found")
    }

fun main() {
    println(Color.BLUE.rgb())
    println(getMnemonic(Color.BLUE))
    println(mix(Color.YELLOW, Color.RED))
}