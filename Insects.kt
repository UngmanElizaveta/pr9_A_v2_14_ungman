open class Insects
    (

    var type:String,
    var name:String,
    var size:String,
) {
    open fun names() {
        println("тип $type")
    }

    open fun types() {
        println("имя $name")
    }

    open fun sizes() {
        println("размер $size")
    }
}

