package doItKotlin.ch03

// 인자와 반환값이 없는 람다식 함수
fun main() {
    val out: () -> Unit = {println("hello world!")}

    out() // 함수처럼 사용가능
    val new = out
    new()

}