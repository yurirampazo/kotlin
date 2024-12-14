package _6_oop.entities

enum class Priority(val value: Int) {
  LOW(1) {
    override fun toString(): String {
      return "PRIORITY ${this.name} value $value"
    }
  },
  MEDIUM(2),
  HIGH(3)
}

enum class AnimalEnum {
  DOG,
  CAT,
  HORSE,
  COW
}


fun main() {
  for (p in Priority.entries) {
  if (p == Priority.HIGH)
    println(p)
  }

  val p = "LOW";

  if (Priority.LOW.name == p) {
    println("Equals")
    println(Priority.LOW)
  }

}