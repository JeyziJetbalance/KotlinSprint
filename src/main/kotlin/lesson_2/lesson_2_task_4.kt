package lesson_2

fun main() {

    val crystalOre = 7
    val ironOre = 11

    val baff = 120
    val baffCrystalOre = crystalOre * baff / 100
    val baffIronOre = ironOre * baff / 100

    println(baffCrystalOre - crystalOre)
    println(baffIronOre - ironOre)

}


