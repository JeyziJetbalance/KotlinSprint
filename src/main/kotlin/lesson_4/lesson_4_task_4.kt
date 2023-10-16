fun main() {

    val trainingDay = 5
    val handsAndPress = trainingDay % 2
    val legsAndBack = trainingDay % 2
    val firstPart = handsAndPress != 0
    val secondPart = legsAndBack == 0

    println(
        """
        |Упражнения для рук: $firstPart
        |Упражнения для ног: $secondPart
        |Упражнения для спины: $secondPart
        |Упражнения для пресса: $firstPart
    """.trimMargin()
    )

}