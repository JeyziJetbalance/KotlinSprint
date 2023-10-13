package lesson_1

fun main() {

//    var second: Int = 6480
//    val minute: Int = second / 60 - 60
//    val hour: Int = second / 3600
//    second = second % 60
//    println("0" + hour + ":" + minute + ":" + "0" + second)
//    println(String.format(""))

    var second = 6480
    var minute = second / 60
    val hour = second / 3600
    minute %= 60
    second %= 60
    println(String.format("%02d:%02d:%02d", hour, minute, second))
}
