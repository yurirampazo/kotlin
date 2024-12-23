package _7_collections

fun generateData(): List<Receip> {
  return listOf(
    Receip(
      "Carbonnara", 1200,
      listOf(
        Ingredient("pasta package", 2),
        Ingredient("Guanchale", 1),
        Ingredient("Eggs", 3),
        Ingredient("Black Pepper", 1),
      )
    ),
    Receip(
      "Lasagna", 1200,
      listOf(
        Ingredient("pasta package", 2),
        Ingredient("Cheese", 1),
        Ingredient("Tomatoes", 3),
        Ingredient("Ham", 1),
      )
    )
  )
}

data class Receip(val name: String, val calories: Int, val ingredients: List<Ingredient>)
data class Ingredient(val name: String, val quantity: Int)

fun main() {
  val data = generateData()

  println("Has data? ${if(data.any()) "yes" else "nope"}")
  println("Has data? ${if(listOf<Int>().any()) "yes" else "nope"}")

  println("There are ${data.count()} elements")

  println("First Name: ${data.first().name}")
  println("Last Name: ${data.last().name}")
  println("First: ${data.first()}")
  println("Last: ${data.last()}")


  println(listOf<Any>().indexOf(0)) // returns -1, good to check without exception
//  listOf<Any>().first() //No such element exception
  println(listOf<Any>().firstOrNull())

}