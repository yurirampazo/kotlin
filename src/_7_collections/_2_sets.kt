package _7_collections

fun main() {
  val set1: Set<Int> = setOf(1, 2, 3, 4, 5)

//  Not a good practice
//  val set2: Set<Any> = setOf(true, false, "3", "abc", 1F)

  val set3: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5, 5, 5, 5)
  println("Size: " + set3.size)
  set3.add(6)
//  set1.add()  // -> not supported for immutable set

  println("Index of 3: " + set3.indexOf(3))
  println("Size: " + set3.size)
  println(set3)

  println("Index of 1: " + set1.indexOf(1))
  println("Index of 6: " +set1.indexOf(6))

  println("Contains 5? " +set1.contains(5))

  set3.clear()
  println(set3)

}