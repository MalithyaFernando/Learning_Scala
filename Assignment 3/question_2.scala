import scala.io.StdIn._

object checkPrime{
    def main(args : Array[String]){
        println("Enter a positive number: ");
        var num: Int = readInt()
        printPrime(num)
    }
    def printPrime(num : Int) {
        var i : Int = 2
        while (i < num){
            if(isPrime(i,i/2)) print(i + " ")
            i = i+1
        }
    }
    def isPrime(num: Int, i:Int) : Boolean ={
        if(i==1) true
        else
            if(num%i == 0) false
            else isPrime(num,i-1);
    }
}