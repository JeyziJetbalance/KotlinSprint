fun main() {

    val today = 13
    val tomorrow = 9
    val availabilityToday = today < NUMBER_OF_TABLES
    val availabilityTomorrow = tomorrow < NUMBER_OF_TABLES
    println(
        "Доступность столиков на сегодня: $availabilityToday\n" +
                "Доступность столиков на завтра: $availabilityTomorrow"
    )

}

const val NUMBER_OF_TABLES = 13