package _2_functions

fun main() {
  averageGrade(1F, 3F, 4F, 10.0F, 12.3F)
}

fun averageGrade(vararg grades: Float): Float {
  var sum = 0F
  for (n in grades) {
    sum += n
  }
  return (sum / grades.size)
}

