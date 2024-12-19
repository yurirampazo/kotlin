package _6_oop._7_interface


interface Wild {

  // interfaces doesnt maintain states of variables,
  // therefore theyre unable to have attributes


  /**
   * It's possible for interfaces to have body methods
   * */
  fun attack() {
    println("sdf")
  }

  fun hide()
}

abstract class Mamal(val name: String) {
  fun wakeUp(){}
  fun sleep(){}

  abstract fun speak()
  abstract fun eat()

}

class Dog(name: String) :Mamal(name), Wild {
  override fun speak() {
    println("Wolf wolf...")
  }

  override fun eat() {
    TODO("Not yet implemented")
  }

  override fun hide() {
   println("hiding")
  }


}

fun main() {

  val lucky = Dog("Lucky")
  lucky.speak()

}