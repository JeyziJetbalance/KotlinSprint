package lesson_2
fun main() {

    val permanentWorkers = 50
    val interns = 30
    val workerSalary = 30000
    val internSalary = 20000
    val salaryCostsWorkers = permanentWorkers * workerSalary
    println(salaryCostsWorkers)
    val salaryCostsInterns = interns * internSalary
    val totalSalaryExpenses = salaryCostsWorkers + salaryCostsInterns
    println(totalSalaryExpenses)
    val averageEmployeeSalary = totalSalaryExpenses / ( permanentWorkers + interns )
    println(averageEmployeeSalary)

}

