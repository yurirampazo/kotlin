package _4_loops

fun main() {

  var i = 0
  while (i < 31) {
    println(i)

    if (i == 12) {
      println("Cont value is $i, breaking loop")
      break
    }
    i++
  }

  i = 0
  while (i < 31) {
    if (i < 24) {
      i++
      println("Continuing $i")
      continue
    } else {
      break
    }
  }
}


