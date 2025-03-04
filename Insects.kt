open class Insects(var type:String, var name:String, var size:String)
{
    open fun names ()
    {
      name=readln()!!.toString()
    }
    open fun types()
    {
        type=readln()!!.toString()
    }
    open fun sizes()
    {
        size=readln()!!.toString()
    }
    open fun GetInfo()
    {
        println("его имя $name, его тип $type,его размер $size")
    }

}