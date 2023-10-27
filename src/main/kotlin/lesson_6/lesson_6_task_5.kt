fun main() {

    print("Придумайте логин: ")
    val login = readln()
    print("Придумайте пароль: ")
    val password = readln()

    var counterBot = 0
    var counter = 0

    while (counter < 3) {

        print("Введите логин: ")
        val loginVerification = readln()
        print("Введите пароль: ")
        val passwordVerification = readln()

        if ((loginVerification == login) && (passwordVerification == password)) {
            println("Пройдите проверку на бота.")
            break
        } else {
            counter++
            println("Данные не верны. Введите заного логин и пароль. При неправильном вводе 3 раза доступ отклонен")
        }

    }

    if (counter == 3) return

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