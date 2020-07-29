object moneyTransfer extends App{
    println("Tranfer Rs.12308.40 from account A to Account B \n")
    val a1 = new Account("971232451V", 1234567, 254345.68)
    println("Account A Details before transfer : \n" + a1 + "\n")
    val a2 = new Account("963452312V", 2345819, 123425.94)
    println("Account B Details before recieve : \n" + a2 + "\n")
    a1.transfer(a2, 12308.40)
    println("Account A Details after transfer : \n" + a1 + "\n")
    println("Account B Details after recieve : \n" + a2 + "\n")
}

class Account(id:String, n:Int, b:Double){
    val nic:String = id
    val acnumber:Int = n
    var balance:Double = b
    def transfer(a:Account, b:Double) = {
        a.balance = a.balance + b
        this.balance = this.balance - b
    }
    override def toString = "[ " + nic + " : " + acnumber + " : Rs." + balance + " ]"
}