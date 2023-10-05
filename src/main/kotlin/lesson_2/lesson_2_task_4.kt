package lesson_2

fun main() {

    val standartMiningCrystal = 7
    val standartMiningIronOre = 11
    val baff = 120
    val baffCrystal = standartMiningCrystal * baff / 100
    val baffIron = standartMiningIronOre * baff / 100
    println(baffCrystal - standartMiningCrystal)
    println(baffIron - standartMiningIronOre)

}


