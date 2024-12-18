package _6_oop._6inheritance

abstract class Mamal(val name: String) {
  fun wakeUp(){}
  fun sleep(){}

  abstract fun speak()
  abstract fun eat()

}

class Dog(name: String) :Mamal(name) {
  override fun speak() {
    println("Wolf wolf...")
  }

  override fun eat() {
    TODO("Not yet implemented")
  }
}

fun main() {

  val lucky = Dog("Lucky")
  lucky.speak()

}