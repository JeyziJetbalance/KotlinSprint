fun main() {

    val weightFirstCargo = 20
    val weightSecondCargo = 50
    val volumeFirstCargo = 80
    val volumeSecondCargo = 100

    println(
        "Груз с весом $weightFirstCargo кг и объемом $volumeFirstCargo л соответствует категории 'Average': " +
                "${((weightFirstCargo >= MIN_WEIGHT) && (weightFirstCargo <= MAX_WEIGHT)) && (volumeFirstCargo < VOLUME)}"
    )

    println(
        "Груз с весом $weightSecondCargo кг и объемом $volumeSecondCargo л соответствует категории 'Average': " +
                "${((weightSecondCargo >= MIN_WEIGHT) && (weightSecondCargo <= MAX_WEIGHT)) && (volumeSecondCargo < VOLUME)}"
    )

}

const val MIN_WEIGHT = 35
const val MAX_WEIGHT = 100
const val VOLUME = 100