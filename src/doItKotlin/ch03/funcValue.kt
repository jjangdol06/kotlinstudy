package doItKotlin.ch03

fun main() {
    var result: Int
    var multi = { x: Int, y: Int -> x * y }
    // 선언 자료형, 람다식 매개변수의 자료형 둘 중 하나만 생략 가능 -> else 추론 오
    val multi2: (Int, Int) -> Int = { x: Int, y: Int ->
        println(x * y)
        x * y
    }
    result = multi(10, 20)
    println(result)

    // 람다식을 보고 매개변수와 반환값을 추론할 수 있다면 람다식의 매개변수 자료형은 생략 가능
    val greet: () -> Unit = { print("hello world!") }
    val greet2 = { print("hello world!") }

    val nestedLambda: () -> () -> Unit = { { print("hellow world!") } }
    val nestedLambda1 = { { print("hellow world!") } }

    val square: (Int) -> Int = { x -> x * x }
    val square2 = { x: Int -> x * x }

    var highOrderResult: Int
    highOrderResult = highOrder({x,y -> x+y}, 10, 20)
    println(highOrderResult)
}

// 매개변수에 람다식 함수를 이용한 고차 함수
fun highOrder(sum: (Int, Int) -> Int, a:Int, b:Int): Int {
    return sum(a, b)
}