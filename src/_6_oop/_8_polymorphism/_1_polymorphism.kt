package _6_oop._8_polymorphism

interface Employee {
  var salary: Float
  fun bonus(): Float
}

class Manager(override var salary: Float) : Employee {

  override fun bonus(): Float {
    return salary * 0.5F
  }
}
class Analyst(override var salary: Float) : Employee {
  override fun bonus(): Float {
    return salary * 0.3F
  }

}

fun showBonus(employee: Employee) {
  println(employee.bonus())
}

fun main() {
  showBonus(Manager(20000F))
  showBonus(Analyst(2000F))
}