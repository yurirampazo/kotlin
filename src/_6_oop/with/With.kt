package _6_oop.with

import _6_oop.entities.Person

fun main() {


  val p = Person(1985, "Frank")
  p.wakeUp()
  p.sleep()

  with(p) {
    this.wakeUp()
    sleep() //infered
    toString()
    hashCode()
  }
}