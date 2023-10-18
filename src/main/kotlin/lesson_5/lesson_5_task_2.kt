
fun main() {

    val userAge = readLine()!!.toInt()
    val currentYear = 2023
    val resultSubtraction = currentYear - userAge

    val resultText = if (resultSubtraction >= AGE_OF_MAJORITY) "Показать экран со скрытым контентом"
    else if (resultSubtraction == 16 || resultSubtraction == 17) "Показать экран со ограниченным контентом"
    else "Вернуться на главный экран"

    println(resultText)

}

const val AGE_OF_MAJORITY = 18