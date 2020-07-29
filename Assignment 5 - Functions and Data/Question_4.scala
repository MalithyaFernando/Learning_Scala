object moneyTransfer extends App{
    val a1 = new Account("971232451V", 1234567, 254345.68)
    val a2 = new Account("963452312V", 2345819, 123425.94)
    val a3 = new Account("965472229V", 3425123, 546312.31)
    val a4 = new Account("953241234V", 9842385, 23421.28)
    val a5 = new Account("932348539V", 1232412, 342529.00)
    var bank:List[Account] = List(a1, a2, a3, a4, a5)
    
    val overdraft = (b:List[Account]) => b.filter(x => x.balance < 0)
    println("Accounts with negative balances : " + overdraft(bank) + "\n")

    val balance = (b:List[Account]) => b.reduce((x,y) => (new Account(x.nic, x.acnumber, x.balance + y.balance)))
    println("The sum of all account balances : Rs." + balance(bank).balance + "\n")

    val interest = (acc: List[Account])=> acc.map (x => {
        if(x.balance < 0) (new Account(x.nic, x.acnumber, x.balance*1.05))
        else (new Account(x.nic, x.acnumber, x.balance*1.1))
    })
    println("The final balances of all accounts after apply the interest : \n" + interest(bank) + "\n")
}

class Account(id:String, n:Int, b:Double){
    val nic:String = id
    val acnumber:Int = n
    var balance:Double = b
    def withdraw(a:Double) = this.balance = this.balance - a
    def deposit(a:Double) = this.balance = this.balance + a
    def transfer(a:Account, b:Double) = {
        a.balance = a.balance + b
        this.balance = this.balance - b
    }
    override def toString = "[" + nic + " : " + acnumber + " : Rs." + balance + "]"
}