package lesson_1

fun main() {

    var second = 6480
    var minute = second / 60
    val hour = second / 3600
    minute %= 60
    second %= 60
    println(String.format("%02d:%02d:%02d", hour, minute, second))

}
