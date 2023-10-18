import kotlin.random.Random

fun main() {

    println("Введите 1 счастливое число: (от нуля до 42 включительно)")
    val firstNumberInConsole = readLine()!!.toInt()
    println("Введите 2 счастливое число: (от нуля до 42 включительно)")
    val secondNumberInConsole = readLine()!!.toInt()
    val firstRandomNumber = (0..42).random()
    val secondRandomNumber = (0..42).random()

    val result = if ((firstRandomNumber == firstNumberInConsole || firstRandomNumber == secondNumberInConsole) &&
            (secondRandomNumber == firstNumberInConsole || secondRandomNumber == secondNumberInConsole))
        "Поздравляем, вы выйграли суперприз!"
    else if ((firstRandomNumber == firstNumberInConsole || firstRandomNumber == secondNumberInConsole) ||
        (secondRandomNumber == firstNumberInConsole || secondRandomNumber == secondNumberInConsole))
        "Поздравляем, вы выйграли утешительный приз."
    else "Не стоило играть в лотерею."

    println(result)

    println("Это были числа $firstRandomNumber и $secondRandomNumber.")
}