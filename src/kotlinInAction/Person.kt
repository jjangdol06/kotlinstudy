package kotlinInAction

// 기본 가시성이 public
class Person(
    val name: String, // setter는 만들지 않는다 -> val 이기 떄문
    var isMarried: Boolean
)

fun main() {
    val person = Person("yeon ", true)
    println(person.name)
}