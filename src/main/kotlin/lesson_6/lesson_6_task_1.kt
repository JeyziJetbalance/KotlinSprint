fun main() {

    print("Придумайте логин: ")
    val login = readln()
    print("Придумайте пароль: ")
    val password = readln()

    var counter = 0

    while (counter < 3) {

        print("Введите логин: ")
        var loginVerification = readln()
        print("Введите пароль: ")
        val passwordVerification = readln()

        if ((loginVerification != login) || (passwordVerification != password)) {
            println("Данные не верны.")
            counter++
        }
        else {
            println("Добро пожаловать.")
            return
        }

    }

    if (counter == 3) println("Доступ запрещен, вы ввели данные неверно 3 раза подряд.")

}