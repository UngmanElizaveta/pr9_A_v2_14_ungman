import Insects.*
class Mosquito(empname:String,emptype:String,empsize:String ):Insects(empname,empname,empsize)
{
    private var count:Int=6;
    public fun Getcount_hands():Int
    {
           return count
    }

    public fun Setcount_hands(count:Int)
    {
        if(count<0)
        {
            println("не может быть отрицательного количества ног")
        }
        else
        {
            this.count=count;
        }
    }
    override fun GetInfo()
    {
        println("его имя $name, его тип $type,его размер $size, количество ног $count")
    }

}