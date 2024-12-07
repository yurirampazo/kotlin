package _4_loops

fun main() {

  for (i in 1..10) {
    println(i)
  }

  for (i in 1..20 step 2) {
    println(i)
  }

  for (i in 20 downTo 0) {
    println(i)
  }


  val str = "kotlin is the best!"
  for (char in str) {
    println("$char")
  }

  val testList = listOf("Yuri", "Jana", "Katiau", "Wilton")
  for (n in testList) {
    println("$n is part of the family")
  }

}


