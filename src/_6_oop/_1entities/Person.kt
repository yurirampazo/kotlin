package _6_oop._1entities

class Person(val birthYear: Int, var name: String) {

  var eyesColor: String = ""
  private var documentNumber: String ? = null

  constructor(birthYear: Int, name: String, eyesColor: String, documentNumber: String) : this(birthYear, name) {
    //Better for validations
    if (documentNumber.isEmpty()) {
      this.documentNumber = ""
    }
    this.documentNumber = documentNumber
  }


  fun sleep() {
    println("Good night!")
  }

  fun wakeUp() = println("Good Morning!")
}

class Empty private constructor()

fun main() {
  val person: Person = Person(1995, "yuri")
  val person2: Person = Person(1995, "jana", "brown", "123")
  val person3: Person = Person(1968, "katia", "green", "123")
  println(person.name)
  person.sleep()
  person.wakeUp()
  person.eyesColor = "Brown"


//  Empty()
//  Nothing()
}