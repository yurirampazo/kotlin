package _5_exceptions_and_null_safety

fun main() {
  val str : String? = null

  if (str.isNullOrEmpty()) {
    println("String is null")
  } else {
    println(str)
  }

  println(str ?: "Kotlin is the best")
}


