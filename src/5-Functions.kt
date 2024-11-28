fun main() {
    helloWorld()
    val a = 1
    val b = 2
//    val sum = sum(1, 2)
//    println("SUm result is $a + $b é: $sum")
    println("Sum result is $a + $b é: ${sum(a, b)}")
    println("DIvision result of $b / $a = ${divide(b.toFloat(), a.toFloat())}")
}

//fun helloWorld(): Unit {  //Unit implicit when not defined a return type
//    println("Hello world")
//}

fun helloWorld() = println("Hello World")

//fun sum(a: Int, b: Int): Int {
//    return a + b
//}

fun sum (a: Int, b: Int)/*: Int*/ = a + b

//fun divide(a: Float, b: Int): Float {
//    return a / b
//}

fun divide(a: Float, b: Float) = a / b