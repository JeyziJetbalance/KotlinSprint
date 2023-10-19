fun main() {

    val isShipHaveDamage = readln().toBoolean()
    val numberOfCrew = readln().toInt()
    val numberBoxesProvisions = readln().toInt()
    val isWeatherFovourable = readln().toBoolean()

    val resultText = if ((isShipHaveDamage == IS_SHIP_HAVE_DAMAGE) && ((numberOfCrew >= MIN_NUMBER_OF_CREW) &&
                (numberOfCrew <= MAX_NUMBER_OF_CREW)) && (numberBoxesProvisions > MIN_BOXES_OF_PROVISIONS)) "Корабль готов к долгосрочному плаванию."
    else if ((isShipHaveDamage != IS_SHIP_HAVE_DAMAGE) && (numberOfCrew == MAX_NUMBER_OF_CREW) &&
        (numberBoxesProvisions > MIN_BOXES_OF_PROVISIONS) && (isWeatherFovourable == IS_WEATHER_FAVOURABLE_ALTERNATIVE)) "Корабль может отплыть с незначительными ограничениями."
    else "Корабль не готов к отплытию."

    println(resultText)
}

const val IS_SHIP_HAVE_DAMAGE = false
const val MIN_NUMBER_OF_CREW = 55
const val MAX_NUMBER_OF_CREW = 70
const val MIN_BOXES_OF_PROVISIONS = 50
const val IS_WEATHER_FAVOURABLE_ALTERNATIVE = true