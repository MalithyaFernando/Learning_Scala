import scala.io.StdIn._

object checkPrime extends App{
    println("Enter a positive number: ");
    var num: Int = readInt()
    printPrime(num)
    def printPrime(num : Int) {
        var i : Int = 2
        while (i < num){
            if(isPrime(i)) print(i + " ")
            i = i+1
        }
    }
    def isPrime(num : Int, i : Int = 2) : Boolean = i match{
        case x if (i == num) => true
        case x if (find_gcd(num, x) > 1) => false
        case x => isPrime(num, x+1)
    }
    def find_gcd(num : Int, i : Int) : Int = i match {
        case 0 => num
        case x if(x > num) => find_gcd(x, num)
        case _ => find_gcd(i, num%i)
    }
}