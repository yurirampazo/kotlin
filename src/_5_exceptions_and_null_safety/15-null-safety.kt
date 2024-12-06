package _5_exceptions_and_null_safety

fun main() {
  val str : String? = null
  println(str?.length)  // Kotlin handles probable exception and returns null

  if (!str.isNullOrEmpty()) {
    println("String $str is not null")
  } else {
    println("String $str is null")
  }


  println(str!!.length) // Kotlin doesn't treat probable null



}


