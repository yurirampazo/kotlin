package _3_conditions

fun main() {
  /**
   * There is no ternary in kotlin, because we can return from if else values,
   * like this
   */

  val age = 18
  val str = if (age > 18) "Adult" else "Not Yet"
  println(str)
}


