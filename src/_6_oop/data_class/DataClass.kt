package _6_oop.data_class

fun main() {
  val f = Shape(10, 8)
  val f2 = Shape(10, 8)
  val ff = f  //data class optimize this with copy
  println(f == ff)

  println(f.toString())
  println(f.hashCode())
  println("---")
  println(f2.toString())
  println(f2.hashCode())
  println("---")
  println(f.equals(f2)) //-> comparing memo reference
  println(f == f2) // for default false, comment override equals in shape class

  println("---")
  println("DATA CLASS TESTS")
  //Try out with Data Class
  val f3 = DataShape(1, 2)
  val f4 = DataShape(1, 2)

  println("f3 to String: $f3")
  println("f3 hashCode: ${f3.hashCode()}")
  println("---")
  println("f4 to String: $f4")
  println("f4 hashCode: ${f4.hashCode()}")
  println("---")
//  println(f3.equals(f4)) // -> can be replaced with binary operator
  println("$f3 Equals $f4  ${f3 == f4}")


  f3.a = 7
  println("f3 to String: $f3")
  println("f3 hashCode: ${f3.hashCode()}")
  println("---")
  println("f4 to String: $f4")
  println("f4 hashCode: ${f4.hashCode()}")

  println("$f3 Equals $f4  ${f3 == f4}")

  val f5 = f3.copy(a = 3)
  println("f3 to String: $f3")
  println("f3 hashCode: ${f3.hashCode()}")
  println("---")
  println("f5 to String: $f5")
  println("f5 hashCode: ${f5.hashCode()}")

  println("$f3 Equals $f5  ${f3 == f5}")

}

class Shape(val a: Int, val b: Int) {
  override fun equals(other: Any?): Boolean {
    return if (other is Shape) {
      other.a == this.a &&
            other.b == this.b
    } else {
      false
    }
  }

  override fun hashCode(): Int {
    return javaClass.hashCode()
  }

//  override fun toString(): String {
//    return super.toString()
//  }
}

data class DataShape(var a: Int, val b: Int)