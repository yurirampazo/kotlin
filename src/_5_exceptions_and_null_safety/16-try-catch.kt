package _5_exceptions_and_null_safety

import java.lang.ArithmeticException

fun main() {
  val str: String? = null
  try {
    val a = 10/0
    println(str!!.length)

  } catch (e: NullPointerException) {
    println("Variable is null")
  } catch (e: ArithmeticException) {
    println("You can't divide a number by 0")
  } catch (e: Exception) {
    println("Generic exception! Not good using it!!")
  }

  finally {
    println("Must close connections with 'finally'")
  }

  println("End of excecution!")
}


