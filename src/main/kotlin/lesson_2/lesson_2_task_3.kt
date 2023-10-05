package lesson_2

fun main() {

    val departureTime = 579
    val travelTime = 457
    val arrivalTime = ( departureTime + travelTime ) / 60
    val arrivalTime_2 = ( departureTime + travelTime ) % 60
    println( "" + arrivalTime + ":" + arrivalTime_2 )
}

