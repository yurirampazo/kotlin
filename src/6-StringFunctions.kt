fun main() {
    val str = "Testing"

    println("String length = ${str.length}")
    println("String first index = ${str[0]}")
    println("String first index = ${str.first()}")
    println("String starts with Tes? ${str.startsWith("Tes")}")
    println("String starts with Tes? ${str.startsWith("Tes")}")
    println(str.substring(2, 5))
    println(str.replace("T", "R"))
    println(str.uppercase())
    println(str.lowercase())
    println("     i dont like whitespaces around my string     ".trim())
}