object theatorObject extends App{    
    var i : Int = 5;
    var max : Int = find_Profit(i)
    var best_price = i
    while (i < 45){
        println("Rs." + i + " : Rs." + find_Profit(i))
        if(max < find_Profit(i)){
            max = find_Profit(i)
            best_price = i
        }
        i = i+5
    }
    println("The best ticket Price is Rs." + best_price)
    def find_Profit(ticket_Price : Int) : Int = find_revenue(ticket_Price) - find_cost(ticket_Price)
    def find_revenue(ticket_Price : Int) : Int = find_attendee(ticket_Price)*ticket_Price
    def find_cost(ticket_Price : Int) : Int = 500 + find_attendee(ticket_Price)*3
    def find_attendee(ticket_Price : Int) : Int = 120 + ((15-ticket_Price)/5)*20
}