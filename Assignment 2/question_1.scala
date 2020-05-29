object salaryObject{

    def main(args: Array[String]){
        println("Take home salary of the employee : Rs." + find_Salary(40, 20))
    }

    def find_Salary(Normal : Int, OT : Int) : Double = find_noTaxSalary(Normal, OT) - find_Tax(find_noTaxSalary(Normal, OT))

    def find_noTaxSalary(Normal : Int, OT : Int) : Int = (150*Normal + 75*OT)*4

    def find_Tax(Value : Int) : Double = Value*0.1
}