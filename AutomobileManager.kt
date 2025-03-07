class AutomobileManager {

  open fun AddAutomobile(automobile: Automobile) {
        var brand = readLine()!!.toString()
        var power = readLine()!!.toInt()
        var price = readLine()!!.toDouble()
    }
   open fun Automobiles() {
        println("Марка: ${Automobile.brand}, Мощность: ${Automobile.power} л.с., Стоимость: ${Automobile.price} руб.")
    }
    open fun Insurances()
    {
        var price=AddAutomobile()
        var insurance=price
    }
}
