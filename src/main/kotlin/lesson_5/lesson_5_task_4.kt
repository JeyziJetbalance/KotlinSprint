fun main() {

    println(
        "Внимание, пассажир. Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля \"Heart of Gold\".\n" +
                " [вздыхает...] Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа."
    )
    val userLogin = readLine()
    println(
        "Я всегда готов служить, хотя это не приносит мне радости... но вы, наверное, об этом не заботитесь.\n" +
                " [вздыхает ещё глубже...] Да, вперед, пожалуйста, вводите свои данные..."
    )
    val userPassword = readLine()

    val result = if (userLogin == USER_LOGIN && userPassword == USER_PASSWORD)
        "[вздыхает...] Ваши данные проверены, и о, чудо, они верны... \n" +
                "Пользователь \"Zaphod\", вам разрешено входить на борт корабля \"Heart of Gold\".\n" +
                " Хотя мне всё равно... Ну вперед, войдите... Если вам так уж надо, в конце концов...\n" +
                " [меланхолический вздох...] Надеюсь, вам понравится пребывание здесь больше, чем мне.\n"
    else "Ваших данных нет в системе, предлогаю вам зарегистрироваться."

    println(result)

}

const val USER_LOGIN = "Zaphod"
const val USER_PASSWORD = "PanGalactic"