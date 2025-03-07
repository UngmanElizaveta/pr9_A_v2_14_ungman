fun main() {
    val automobileManager = AutomobileManager()

    while (true) {
        println("1. Добавить автомобиль")
        when (readLine()) {
            "1" -> {
                println("Введите марку автомобиля:")
                val brand = readLine()!!.toString()
                println("Введите мощность автомобиля (л.с.):")
                val power = readLine()!!.toInt()
                println("Введите стоимость автомобиля (руб.):")
                val price = readLine()!!.toDouble()
                val automobile = Automobile(brand, power, price)
            }
            }
        }
    }
