fun main() {

    print("Придумайте логин: ")
    val login = readln()
    print("Придумайте пароль: ")
    val password = readln()

    var counterBot = 0
    var counter = 0

    while (counter == 0) {

        print("Введите логин: ")
        var loginVerification = readln()
        print("Введите пароль: ")
        val passwordVerification = readln()

        if ((loginVerification != login) || (passwordVerification != password)) println("Данные не верны.")
        else counter++

        while (counterBot != 3) {

            val firstNumber = (1..9).random()
            val secondNumber = (1..9).random()
            val result = firstNumber + secondNumber
            print("Решите пример: $firstNumber + $secondNumber = ")
            val resultVerification = readln().toInt()

            if (counterBot == 2) {
                println("Отказано в доступе.")
                return
            }

            if (result == resultVerification) {
                println("Добро пожаловать!")
                return
            } else {
                println("Попробуйте еще раз.")
                counterBot++
            }

        }

    }
}