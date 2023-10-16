fun main() {

    val weather = true
    val outdoorAwning = true
    val airHumidity = 20
    val season = "зима"

    val weatherToday = true
    val outdoorAwningToday = true
    val airHumidityToday = 20
    val seasonToday = "зима"

    val verificationResult =
        (weather == weatherToday) && (outdoorAwning == outdoorAwningToday) && (airHumidity == airHumidityToday) && (seasonToday != season)

    println("Благоприятные ли условия сейчас для роста бобовых? $verificationResult")
}