package _7_collections

fun main() {
  val map1 = mapOf<Int, String>(
    Pair(1, "Brazil"),
    Pair(2, "Italy"),
    Pair(2, "Japan")
  )

  println(map1)
  println(map1.entries)
  println(map1.keys)
  println(map1.values)

  val map2 = mutableMapOf<String, String>(
    Pair("Italy", "Rome"),
    Pair("Spain", "Madrid"),
    Pair("Spain", "Madrid"),
    Pair("Croatia", "Zagreb"),
  )

  println(map2.entries)
  println()
  map2["Switzerland"] = "Bern"
  map2["Netherlands"] = "Amsterdam"
  println(map2.entries)


  map2.remove("Spain")
  println(map2.entries)
  map2.contains("Italy")
  map2.clear()
  println(map2.entries)
}