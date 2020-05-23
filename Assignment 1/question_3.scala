object BookObject {  
   def main(args: Array[String]) = {
          findCost(60)
    }  
    def findCost(copies : Int) = {  
        var bookCover = 24.95
        var discount = 40
        var cost : Double = 0
        if(copies <= 50){
            cost = ((bookCover*copies)*(100-discount)/100 + copies*3);
        }else{
            cost = ((bookCover*copies)*(100-discount)/100 + 50*3 + (copies-50)*0.75);
        }
        println("Total wholesale cost for " + copies + " copies : Rs." + cost)
    }  
}  
