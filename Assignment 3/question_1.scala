import scala.io.StdIn._

object checkPrime{
    def main(args : Array[String]){
        println("Enter a positive number: ")
        var num: Int = readInt()
        if(isPrime(num,num/2)) println(num + " is a prime number")
        else println(num + " is not a prime number")
    }

    def isPrime(num: Int, i:Int) : Boolean ={
        if(i==1) true
        else
            if(num%i==0) false
            else isPrime(num,i-1)
    }
}