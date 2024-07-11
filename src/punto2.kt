fun main() {
    val childAge = 5
    val adultAge = 28
    val seniorAge = 87
    val isMonday = true

    println("The movie ticket price for a person aged $childAge is \$${calculateTicketPrice(childAge, isMonday)}.")
    println("The movie ticket price for a person aged $adultAge is \$${calculateTicketPrice(adultAge, isMonday)}.")
    println("The movie ticket price for a person aged $seniorAge is \$${calculateTicketPrice(seniorAge, isMonday)}.")
}

fun calculateTicketPrice(age: Int, isMonday: Boolean): Int {
    return when {
        age <= 12 -> 15
        age in 13..60 -> if (isMonday) 25 else 30
        age > 60 -> 20
        else -> 0
    }
}
