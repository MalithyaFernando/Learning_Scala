import scala.io.StdIn._

object printFibonacci extends App{
    println("Enter a number : ")
    var num = readInt()
    print_fibonacci(num)
    def print_fibonacci(num : Int){
        print("First " + num + " Fibonacci numbers are : ")
        var i : Int = 0
        while (i < num){
            print(get_fibonacci(i) + " ")
            i = i+1
        }
    }
    def get_fibonacci(num : Int) : Int = num match {
        case 0 => 0
        case 1 => 1
        case x => get_fibonacci(num-2) + get_fibonacci(num-1)
    }
}