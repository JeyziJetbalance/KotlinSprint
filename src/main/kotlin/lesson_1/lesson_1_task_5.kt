package lesson_1

fun main() {

    var second: Int = 6480
    val minute: Int = second / 60 - 60
    val hour: Int = second / 3600
    second = second % 60
    println("0" + hour + ":" + minute + ":" + "0" + second)

}
