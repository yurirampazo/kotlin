package _6_oop.entities

class Planet(name: String) {
  var primaryStar: String = ""
    get() {
      println("Getter, if you only want to return field, dont need to implement")
      return field //returning field name will cause a loop
    }

    set(value) {
      println("Setting value $value to field")
      field = value
    }
}

fun main() {
  val earth = Planet("Earth")
  earth.primaryStar = "moon"
  println(earth.primaryStar)
}