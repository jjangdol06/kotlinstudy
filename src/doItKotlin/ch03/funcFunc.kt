package doItKotlin.ch03

// 반환값에 일반 함수 사용해 보
fun main() {
    println("funcFunc : ${funcFunc()}")
}

//fun sum(a: Int, b: Int) = a+b

fun funcFunc(): Int {
    return sum(2,2)
}