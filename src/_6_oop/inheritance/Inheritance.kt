package _6_oop.inheritance

open class Car(var model: String) {

  private var running : Boolean = false

  open fun start(){
    heatOil()
    running = true
  }
  fun turnOff(){
    running = false
  }
  private fun heatOil(){}
}

class Sportive(model: String): Car(model) {

  var remoteKey: Boolean = true

  fun drift(){}
  override fun start(){
    if (remoteKey) {
      println("starting engine")
    } else {
      println("the car needs the key to be in its spot")
    }
  }

  fun start(backupKey: Boolean) {
    if (backupKey) {
      println("Starting car with backup key")
      start()
    } else {
      println("Cannot start car")
    }
  }
}

fun main() {
  var c = Car("BMW")

  c.start()
  c.turnOff()
  c.model


  c = Sportive(c.model)
  c.start()
  c.drift()
//  c.heatOil()
}