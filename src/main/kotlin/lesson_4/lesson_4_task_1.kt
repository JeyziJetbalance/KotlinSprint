fun main() {

    val today = 13
    val tomorrow = 13 - 4
    val availabilityToday = today < 13
    val availabilityTomorrow = tomorrow < 13
    println(
        "Доступность столиков на сегодня: $availabilityToday\n" +
                "Доступность столиков на завтра: $availabilityTomorrow"
    )

}