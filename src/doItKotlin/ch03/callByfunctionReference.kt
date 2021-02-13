package doItKotlin.ch03

// 다른 함수의 참조에 의한 일반 함수 호출
fun main() {
    // 1. 인자와 반환값이 있는 함수
    val res1 = funcParam(3, 2, ::sum)
    println(res1)

    // 2. 인자가 없는 함수
    hello(::text)

    // 3. 일반 변수에 값처럼 할당
    // :: 세미콜론 두개로 인자를 생략하고 사용할 수 있다.
    val likeLambda = ::sum
    println(likeLambda)
}

fun text(a: String, b: String) ="Hi! $a $b"

fun funcParam(a: Int, b: Int, c: (Int, Int) -> Int): Int {
    return c(a, b)
}

fun hello(body: (String, String) -> String): Unit {
    println(body("hello", "world"))
}