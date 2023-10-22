fun main() {

    print("Введите количество секунд: ")
    val numberSeconds = readln().toInt()
    var counter = numberSeconds

    while (counter >= 0) {

        if (counter == 0) println("Прошло $numberSeconds секунд.")
        Thread.sleep(1000)
        counter--

    }

}