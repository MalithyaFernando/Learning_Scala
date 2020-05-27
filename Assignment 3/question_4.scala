import scala.io.StdIn._

object OddnEven{
    def main(args : Array[String]){
        println("Enter a number : ")
        var num = readInt()
        println(num + " is an " + find_evenorodd(num) + " number")
    }
    def find_evenorodd(num : Int) : String = {
        if(num == 0) "even"
        else if(num == 1) "odd"
        else if(num < 0) find_evenorodd(-num)
        else find_evenorodd(num-2);
    }
}