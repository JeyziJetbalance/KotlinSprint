fun main() {

    val isSunny = true
    val isAwningOpen = true
    val airHumidityToday = 20
    val seasonToday = "зима"

    val verificationResult =
        (SUNNY == isSunny) && (AWNING_OPEN == isAwningOpen) && (AIR_HUMIDITY == airHumidityToday) && (seasonToday != season)

    println("Благоприятные ли условия сейчас для роста бобовых? $verificationResult")
}

const val SUNNY = true
const val AWNING_OPEN = true
const val AIR_HUMIDITY = 20
const val season = "зима"