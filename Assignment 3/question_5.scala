import scala.io.StdIn._

object getEvenSum{
    def main(args : Array[String]){
        println("Enter a number : ")
        var num = readInt()
        println("Addition of all even numbers less than " + num + " : " + get_sumofeven(num))
    }
    def get_sumofeven(num : Int) : Int = {
        if(num == 0) 0
        else if((num > 0)&&(num%2 == 0)) num+get_sumofeven(num-2)
        else get_sumofeven(num-1)
    }
}