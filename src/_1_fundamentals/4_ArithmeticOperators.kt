package _1_fundamentals

fun main() {

//    +, -, *, /, %

    var age = 30

    age += 3
    println(age)
    age++
    println(age)
    age -= 2
    println(age)
    age--
    println(age)
    age *= 4
    println(age)
    age /= 2
    println(age)
    val evenOrOdd =  if ((10 % 3) != 0) "Even" else "Odd";
    println(evenOrOdd)

}