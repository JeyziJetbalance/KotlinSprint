fun main() {

    val reservedTablesToday = 13
    val reservedTablesTommorow = 9
    val availabilityTablesToday = reservedTablesToday < NUMBER_OF_TABLES
    val availabilityTablesTomorrow = reservedTablesTommorow < NUMBER_OF_TABLES
    println(
        "Доступность столиков на сегодня: $availabilityTablesToday\n" +
                "Доступность столиков на завтра: $availabilityTablesTomorrow"
    )

}

const val NUMBER_OF_TABLES = 13