import scala.io.StdIn._

object getEvenSum extends App{
    println("Enter a number : ")
    var num = readInt()
    println("Addition of all even numbers less than " + num + " : " + get_sumofeven(num))
    def get_sumofeven(num : Int) : Int = num match {
        case 0 => 0
        case x if(find_even(num)) => num + get_sumofeven(num-1)
        case _ => get_sumofeven(num-1)
    }
    def find_even(num : Int) : Boolean = {
        if(num%2 == 0) true
        else false
    }
}