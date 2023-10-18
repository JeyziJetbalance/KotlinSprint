fun main() {

    val firstTerm = 5
    val secondTerm = 8
    val resultAddition = firstTerm + secondTerm
    println("Напишите результат математического примера на сложение: $firstTerm + $secondTerm")
    val answer = readLine()!!.toInt()

    val resultVerification = if (answer == resultAddition) "Добро пожаловать!"
    else "Доступ запрещен."

    println(resultVerification)

}