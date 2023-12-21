package FundforFuture
import scala.io.StdIn.{readInt, readLine}
//This is the child class of Account and it contains method calculate interest
//This function is used calculate the interest on particular amount
  class SavingsAccount extends Account {
    var interest: Double = 2

    def calculate_interest(x:Int): Unit = {
      //println("Enter the account number to calculate the interest")
      val interest_acc = readInt() //Reading account number
      val index_interest = account_number.indexOf(interest_acc)//ndexOf() method returns the index of acc_num
      interest = (balance_amt(index_interest) * 2) / 100// Calculating the interest
      println("The interest amount is: " + interest)
    }
/*This is override function show_account_details from  account  which is used to show the details
 of customer when we enter an account number*/
  override def show_account_details(): Unit = {
    println("Enter the account_number to see its details: ")
    val acc_num4 = readInt()
    val index4 = account_number.indexOf(acc_num4)

    println("Details of this account is\n" +
      "Name of customer is: " + names(index4) +
      "\nAccount number is: " + account_number(index4) +
      "\nPhone number is: " + phone_number(index4) +
      "\nAccount balance is: " + balance_amt(index4))
  }


}

