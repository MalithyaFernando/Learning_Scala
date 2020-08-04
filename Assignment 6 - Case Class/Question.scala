import scala.io.StdIn._
import scala.math.pow
import scala.math.sqrt

object Points extends App{
    val p1 = new Point(6, 12)
    val p2 = new Point(3, 4)
    println(p1 + " + " + p2 + " = " + (p1 + p2))
    println("After move " + p1 + " is " + p1.move(2, 5))
    println("Distance of " + p1 + " and " + p2 + " is " + p1.distance(p2))
    println(p1 + " reverses to " + p1.invert())
    println(p2 + " reverses to " + p2.invert())
}

case class Point(a:Int, b:Int){
    def x:Int = a
    def y:Int = b
    
    def +(p: Point) =
        new Point(this.x + p.x, this.y + p.y)
    def move(dx: Int, dy:Int) =
        new Point(this.x + dx, this.y + dy)
    def distance(p: Point) : Double =
        sqrt(pow((p.x - this.x), 2) + pow((p.y - this.y), 2))
    def invert() =
        new Point(this.y, this.x)

    override def toString = "(" + x + ", " + y + ")"
}