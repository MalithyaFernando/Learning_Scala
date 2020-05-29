import scala.io.StdIn._

object OddnEven extends App{
    println("Enter a number : ")
    var num = readInt()
    if(find_even(num)) println(num + " is an even number")
    else println(num + " is not an odd number")
    def find_even(num : Int) : Boolean = {
        if(num%2 == 0) true
        else false
    }
}