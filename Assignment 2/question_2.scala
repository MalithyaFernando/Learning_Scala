object theatorObject{

    def main(args: Array[String]){
        println("The best ticket Price is Rs." + find_bestTicketPrice())
    }

    def find_bestTicketPrice() : Int = find_Max(find_Profit(15, 120), find_Profit(10, 140), find_Profit(20, 100))

    def find_Profit(ticket_Price : Int, people : Int) : Int = (ticket_Price*people) - (500 + 3*people)

    def find_Max(profit_15 : Int, profit_10 : Int, profit_20 : Int) : Int = {
        if(profit_15 > profit_10)
            if(profit_15 > profit_20) 15 else 20
        else
            if(profit_10 > profit_20) 10 else 20
    }
}