fun main() {
    val randomNumber = (1..9).random()

    var counter = 5

    while (counter >= 0) {

        var userNumber = readln().toInt()

        if (userNumber == randomNumber) {
            println("Это была великолепная игра! Вы угадали число и получаете главный приз, 1 миллион долларов.")
            return
        } else println("Неверно, оставшееся число попыток ${--counter}.")

        if (counter == 0) println("Было загадано число $randomNumber.")
    }

}