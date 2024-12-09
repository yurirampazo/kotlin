package _2_functions

fun main() {
  println(averageGrade2(false, 1F, 3F, "", false, 12.3F))
}

fun <T, J> averageGrade2(test: J, vararg grades: T): Float {
  var sum = 0F
  for (n in grades) {
    when (n) {
      is Float -> sum += n
      is Int -> sum += n.toFloat()
      is Long -> sum += n.toFloat()
      is Short -> sum += n.toFloat()
      is Byte -> sum += n.toFloat()
      is String -> sum += tryToSumWithString(n)
      else -> continue
    }
  }
  return (sum / grades.size)
}

fun tryToSumWithString(n: String?): Float {
  if (n.isNullOrEmpty()) return 0F
  try {
    return n.toFloat()
  } catch (e: Exception) {
    println(e.let {
      it.message
      it.localizedMessage
      it.cause
      it.javaClass
    })
    return 0F
  }
}

