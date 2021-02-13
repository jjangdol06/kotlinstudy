package kotlinInAction

import java.io.BufferedReader
import java.io.StringReader
import java.lang.NumberFormatException
import java.nio.Buffer

// 자바와 같이 try 사용하기
fun readNumber(reader: BufferedReader):Int?{
    try{
        val line = reader.readLine()
        return Integer.parseInt(line)
    }catch(e: NumberFormatException){
        throw IllegalArgumentException("$e") //
        return null
    }finally{
        reader.close()
    }
}

// try를 식으로 사용
fun readNumber2(reader: BufferedReader){
    val number = try{
        Integer.parseInt(reader.readLine())
    }catch(e: NumberFormatException){
        null
    }
    println(number)
}

fun main() {
    val reader = BufferedReader(StringReader("239"))
    println(readNumber(reader))

    val reader2 = BufferedReader(StringReader("not a number"))
    println(readNumber2(reader2)) // Kotlin.Unit을 반환한다?...
}