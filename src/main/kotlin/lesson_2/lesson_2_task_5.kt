package lesson_2

import kotlin.math.pow

fun main() {

    val depositAmount = 70000
    val interestRate = 16.7
    val depositTime = 20
    val accrualPeriods = 1
    val totalAmountDeposit = depositAmount * (1 + interestRate/100).pow(depositTime)
    println(String.format("%.3f", totalAmountDeposit))

}