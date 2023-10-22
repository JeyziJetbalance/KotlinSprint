fun main() {

    print("Придумайте логин: ")
    val login = readln()
    print("Придумайте пароль: ")
    val password = readln()

    var counter = 0

    while (counter == 0) {

        print("Введите логин: ")
        var loginVerification = readln()
        print("Введите пароль: ")
        val passwordVerification = readln()

        if ((loginVerification != login) || (passwordVerification != password)) println("Данные не верны.")
        else {
            counter++
            println("Добро пожаловать.")
        }

    }
}