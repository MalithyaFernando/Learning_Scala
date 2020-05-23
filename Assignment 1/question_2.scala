import scala.math._

object VolumeObject {  
    def main(args: Array[String]) {
        findVol()
    }  
    def findVol(){
        var radius = 5
        var volume = (4/3)*radius*radius*radius*Pi;
        println("Volume of a sphere with radius " + radius + " : " + volume)
    }  
}