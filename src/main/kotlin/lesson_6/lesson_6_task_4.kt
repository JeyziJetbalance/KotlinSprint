fun main() {
    val randomNumber = (0..9).random()

    var counter = 5

    while (counter >= 0) {

        var userNumber = readln().toInt()

        if (userNumber == randomNumber) {
            println("Это была великолепная игра! Вы угадали число и получаете главный приз, 1 миллион долларов.")
            counter = counter - 6 // число 6 для того чтобы цикл counter стал отрицательным и цикл прекратился
        } else println("Неверно, оставшееся число попыток ${--counter}.")

        if (counter == 0) println("Было загадано число $randomNumber.")
    }

}