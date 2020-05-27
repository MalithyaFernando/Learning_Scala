import scala.io.StdIn._

object getSum{
    def main (args : Array[String]){
        println("Enter a number : ")
        var num = readInt()
        println("the addition of numbers from 1 to " + num + " : " + find_sum(num));
    }
    def find_sum(num : Int) : Int = {
        if(num == 1) 1
        else num + find_sum(num-1)
    }
}