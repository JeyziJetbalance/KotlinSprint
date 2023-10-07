package lesson_2

fun main() {

    val timeOut = 579
    val timeIn = 457

    val hour = ( timeOut + timeIn ) / 60
    val minute = ( timeOut + timeIn ) % 60

    println("$hour:$minute")
}

