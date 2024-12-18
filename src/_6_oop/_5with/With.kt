package _6_oop._5with

import _6_oop._1entities.Person

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