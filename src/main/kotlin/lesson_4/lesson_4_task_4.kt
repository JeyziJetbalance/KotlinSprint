fun main() {

    val trainingDay = 5
    val isEven = trainingDay % 2 == 0
    val isOdd = !isEven

    println(
        """
        |Упражнения для рук: $isOdd
        |Упражнения для ног: $isEven
        |Упражнения для спины: $isEven
        |Упражнения для пресса: $isOdd
    """.trimMargin()
    )

}