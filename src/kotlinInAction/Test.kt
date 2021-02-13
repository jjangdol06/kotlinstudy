package kotlinInAction

// 블록이 본문인 함수
//fun max(a: Int, b: Int): Int {
//    return if (a > b) a else b
//}

// 식이 본문인 함수 -> type inference available
// 반환 타입 생략 가능 -> type inference
//fun max(a: Int, b: Int) = if (a > b) a else b


fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "kotlin"
    println("hello, ${name}!")
}
