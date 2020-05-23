object TempObject {  
    def main(args: Array[String]) {
        findTempInF()
    }  
    def findTempInF(){
        var tempInC = 35
        var tempInF = tempInC*1.8 + 32
        println(tempInC + " Celsius is in Fahrenheit : " + tempInF)
    }
}