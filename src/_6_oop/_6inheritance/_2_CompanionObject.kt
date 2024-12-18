package _6_oop._6inheritance


class Math2 {
  companion object NAME {
    const val PI: Float = 3.141592F
    fun test() {}

    /**
     * it'll be called once when instanciated,
     * even if there are more calls to the companion object
     * */
    init {
      println("Initialized")
    }
  }

  object obj1 {
    const val PI: Float = 3.141592F
    fun test() {}
  }

  object obj2 {
    const val PI: Float = 3.141592F
    fun test() {}
  }


}


fun main() {

  Math2.NAME.PI
  Math2.PI
  Math2.PI
  println(kotlin.math.PI)
  Math2.test()

  val m = Math2()

  println(Math2.obj1.PI)
  println(Math2.obj2.test())

//  cannot access class variables in instances
//  m.PI
//    m.test()
}