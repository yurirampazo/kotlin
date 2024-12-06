package _2_functions

fun main() {
    convertYears(3)
    println(powOfThree(3F))
    println(replaceAWithX("AN idea"))
    println(milesToKM(1.6))
}

fun milesToKM(d: Double) = "${d / 1.6} Km"

fun convertYears(years: Int) {
    println("$years are like: ")
    println("${years * 12} months")
    println("${years * 365} days")
    println("${years * 365 * 24} hours")
    println("${years * 365 * 24 * 60} minutes")
    println("${years * 365 * 24 * 3600} seconds")

}

fun powOfThree(num: Float): Float = (num * num * num)
fun powOfThree2(num: Float) = (num * num * num)

fun replaceAWithX(str: String): String = str.replace(Regex("[A|a]"), "x").lowercase()
fun replaceAWithX2(str: String) = str.replace(Regex("[A|a]"), "x").lowercase()
