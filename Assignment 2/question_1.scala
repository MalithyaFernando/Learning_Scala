object salaryObject extends App{
    println("Take home salary of the employee : Rs." + find_Salary(40, 20))
    def find_Salary(n_h : Int, ot_h : Int) : Double = find_income(n_h, ot_h) - find_Tax(find_income(n_h, ot_h))
    def find_income(n_h : Int, ot_h : Int) : Int = (find_n_h(n_h)+find_ot_h(ot_h))*4
    def find_n_h(n_h : Int) : Int = 150*n_h
    def find_ot_h(ot_h : Int) : Int = 75*ot_h
    def find_Tax(Value : Int) : Double = Value*0.1
}