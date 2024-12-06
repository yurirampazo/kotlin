package _1_fundamentals

/**
 * Type     Bit
 * Double   64
 * Float    32
 * Long     64
 * Int      32
 * Short    16
 * Byte     8
 * Boolean  ?
 * String   ?
 * Char     ?
 *
 * */

fun main() {

    // Unsigned

    println("Long MAX ${ULong.MAX_VALUE} - MIN ${ULong.MIN_VALUE}")
    println("Int MAX ${UInt.MAX_VALUE} - MIN ${UInt.MIN_VALUE}")
    println("Short MAX ${UShort.MAX_VALUE} - MIN ${UShort.MIN_VALUE}")
    println("Byte MAX ${UByte.MAX_VALUE} - MIN ${UByte.MIN_VALUE}")

    val abc: UInt = 0u
    val short: UShort = 10u
    val byte: UByte = 10u
    val long: ULong = 10u

    System.out.printf("teste %d legal", short) // -> Causes error

}