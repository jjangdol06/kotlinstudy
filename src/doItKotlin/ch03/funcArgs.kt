package doItKotlin.ch03

// 인자에 일반 함수 사용해 보
fun main() {
    val res1 = sum(3, 2)
    val res2 = mul(sum(3,3,), 3)

    println("res1 : $res1, res2: $res2")
}

fun sum(a: Int, b: Int) = a + b

fun mul(a: Int, b: Int) = a * b


