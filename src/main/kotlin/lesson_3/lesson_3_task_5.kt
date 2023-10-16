package lesson_3

fun main() {

    val string = "D2-D4;0"
    val parts = string.split("-", ";") //
    val whereFrom = parts[0]
    val where = parts[1]
    val strokeNumber = parts[2]

    println("Откуда: $whereFrom")
    println("Куда: $where")
    println("Номер хода: $strokeNumber")
}