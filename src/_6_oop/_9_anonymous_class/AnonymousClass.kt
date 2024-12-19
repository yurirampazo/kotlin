package _6_oop._9_anonymous_class

interface Event {
  fun onSuccess()
}

class Program() {
  fun save(e: Event) {
    println("Opening connections...")
    println("Saving values...")
    println("Success, closing connections...")
    e.onSuccess()
  }
}

fun main() {
  val p = Program()
  p.save(object : Event {
    override fun onSuccess() {
      println("On Success")
    }
  })
}