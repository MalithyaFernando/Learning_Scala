import scala.io.StdIn._

object getSum extends App{
    println("Enter a number : ")
    var num = readInt()
    println("the addition of numbers from 1 to " + num + " : " + find_sum(num));
    def find_sum(num : Int) : Int = num match {
        case 0 => 0
        case 1 => 1
        case _ => num + find_sum(num-1)
    }
}