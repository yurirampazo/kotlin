package _6_oop._1entities

class Animal(var species: String) {

  var noise : String ? = null
  init {
    println("This is a/an $species")
  }
  init {
    println("init 2 -> natural order")
    if (species == "dog" || species == "daaaaaWg") {
      noise = "Wolf wolf..."
    } else if (species == "cat") {
      noise = "meowww..."
    } else {
      noise = "..."
    }
  }


  fun makeNoise() {
    println(this.noise)
  }

}

fun main() {
  val animal = Animal("dog")
  val animal2 = Animal("cat")

  animal.makeNoise()
  animal2.makeNoise()

}