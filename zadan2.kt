/*import Insects as NewInsect
import Mosquito as Mosquitoslass*/
fun main() {
    println("введите данные")
    println("тип")
    val type = readln()!!.toString()
    println("имя")
    val name = readln()!!.toString()
    println("размер")
    val size = readln()!!.toString()
    val insect: Insects = when (type.lowercase()) {
        "комар" -> Insects(type, name, size)
        else -> Insects(type, name, size)
    }
}