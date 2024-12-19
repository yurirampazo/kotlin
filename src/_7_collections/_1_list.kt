package _7_collections

fun main() {
  val list1: List<Int> = listOf(1, 2, 3, 4, 5)

//  Not a good practice
//  val list2: List<Any> = listOf(true, false, "3", "abc", 1F)

  val list3: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
  println(list3.size)
  list3.add(5, 6)
//  list1.add()  // -> not supported for immutable list

  println(list3[0])
  println(list3.size)
  list3.removeLast()
  println(list3)
  list3.removeAt(1)
  println(list3)


  println(list1.indexOf(1))
  println(list1.indexOf(6))

  println(list1.contains(5))

  list3.clear()
  println(list3)

}