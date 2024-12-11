package _6_oop

class Person(val birthYear: Int, var name: String) {

  var eyesColor: String = ""

  fun sleep() {
    println("Good night!")
  }

  fun wakeUp() = println("Good Morning!")
}


fun main() {
  val person: Person = Person(1995, "yuri")
  println(person.name)
  person.sleep()
  person.wakeUp()
  person.eyesColor = "Brown"
}