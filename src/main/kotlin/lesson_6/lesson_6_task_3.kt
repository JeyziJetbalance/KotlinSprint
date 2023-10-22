fun main() {

    print("Введите количество секунд: ")
    val numberSeconds = readln().toInt()
    var counter = numberSeconds

    while (counter >= 0) {

        if (counter == 0) println("Время вышло.")
        else println("Осталось секунд: $counter")
        Thread.sleep(1000)
        counter--

    }

}