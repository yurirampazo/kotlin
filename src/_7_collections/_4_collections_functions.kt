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
    ),
    Receip(
      "Light cake", 450,
      listOf(
        Ingredient("Eggs", 2),
        Ingredient("Vanilla", 1),
        Ingredient("Wheat flour", 1),
        Ingredient("Banana", 2),
        Ingredient("Dark Chocolate", 1),
      )
    )
  )
}

data class Receip(val name: String, val calories: Int, val ingredients: List<Ingredient>)
data class Ingredient(val name: String, val quantity: Int)

fun main() {
  val data = generateData()

  /**
   * Fundamental methods:
   * - any
   * - count
   * - first
   * - last
   * */
  println("Has data? ${if (data.any()) "yes" else "nope"}")
  println("Has data? ${if (listOf<Int>().any()) "yes" else "nope"}")

  println("There are ${data.count()} elements")

  println("First Name: ${data.first().name}")
  println("Last Name: ${data.last().name}")
  println("First: ${data.first()}")
  println("Last: ${data.last()}")

  /**
   *
   * Checking for null lists or indexes
   * */
  println(listOf<Any>().indexOf(0)) // returns -1, good to check without exception
//  listOf<Any>().first() //No such element exception
  println(listOf<Any>().firstOrNull())



  println(listOf(1, 2, 3).sum())
  println(listOf<Int>().sum())
//  println(listOf<Any>().sum()) // illegal


  /**
   *
   * Lambdas: Filter, any, count, Sum of...
   * */
  val sumOf = data.sumOf { it.calories }
  println("Total calories: $sumOf")

  val filter = data.filter { it.name == "Lasagna" }
  val filter2 = data.filter { it.calories >= 500 }

  println("Filter: $filter")
  println("Filter 2: $filter2")

  val any = data.any() { it.calories > 100 }
  val count = data.count() { it.calories > 100 }
  println(any)
  println(count)
2
  /**
   * Take and take last
   * */
  println(data.take(2))
  println(data.takeLast(2))

  /**
   * ForEach
   * */
  data.forEach { println("Receip: ${data.indexOf(it) + 1} -> ${it.name}") }
  data.filter { it.calories > 500 }.forEach { println("${it.name} has more than 500 calories") }

  /**
   * Max and min
   * */



}