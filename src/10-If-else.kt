fun main() {
    var bonus = 0F
    val role =  "MANAGER"
    val role2 =  "SOFTWARE ENGINEER"
    bonus = getBonusWhen(role)
    println("The bonus of role $role is $bonus")
    bonus = getBonusIf(role2)
    println("The bonus of role $role2 is $bonus")
}

fun getBonusIf(role: String): Float {
    return if ("MANAGER" == role.uppercase()) 2000F
    else if ("LEADER" == role.uppercase()) 1500F
    else if ("SOFTWARE ENGINEER" == role.uppercase()) 1000F
    else if ("INTERN" == role.uppercase()) 300F
    else 0F
}

fun getBonusWhen(role: String): Float {
    return when(role.uppercase()) {
        "MANAGER" -> 2000F
        "LEADER" -> 1500F
        "SOFTWARE ENGINEER" -> 1000F
        "INTERN" -> 300F
        else -> 0F
    }
}

