package _6_oop._4late_init

class Recipe {
//  var instructions : String? = null
  lateinit var instructions : String

  fun generateRecipe() {
    instructions = "Wash your hands"
  }

  fun printRecipe() {
    if (!this::instructions.isInitialized) {
      instructions = "Wash your hands"
    }
  }
}

fun main () {
  val r = Recipe()
  val r2 = Recipe()
  r.printRecipe()
  r2.generateRecipe()
  r.instructions.length
  r2.instructions.length
  println(r.instructions)
  println(r2.instructions)



}