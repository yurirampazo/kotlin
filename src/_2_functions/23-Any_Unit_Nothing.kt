package _2_functions

fun main() {
  var test = test2(false)
  test4()
  test3()


}

// Any is the primary class in Kotlin, like object in java
//Everything in Kotlin is an any
fun test2(b: Any): String {
  return ""
}

// Unit is like a void type of return
fun test3(): Unit {
  println("Test3")
  return
}

//
fun test4(): Nothing {
  TODO("TO BE IMPLEMENTED")
}
