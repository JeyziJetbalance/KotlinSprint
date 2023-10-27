fun main() {

    print("Введите количество секунд: ")
    val numberSeconds = readln().toInt()
    val timeSleep = (numberSeconds * 1000).toLong()
    Thread.sleep(timeSleep)
    println("Прошло $numberSeconds секунд")


}