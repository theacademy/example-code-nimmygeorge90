package FundforFuture
import scala.io.StdIn.{readInt, readLine}
//This is the child class of account, the main methods are opening() and closing()
//Opening() method is used to open any new account
  class OpeningClosing extends Account
  {

    // Method to open an account
    def opening(): Unit ={


      //  It asks the user for its name, sets, and account number and asks user for initial balance
      var new_name = readLine("Enter the name: ")
      names += new_name
      println("Enter the opening balance: ")
      var opening_balance = readInt()
      balance_amt += opening_balance
      println("Account added successfully")
    }
/*This method is used to generate an account number, it begins from 1001, then it is automatically
    increases by using util.random library by generating random numbers */
    def generate_account_number(): Long = {
        val rand = new scala.util.Random
        rand.between(1001, 1200)

    }

    // Method used to close an existing account
    /* It asks the user to enter the account number and then checks the index of that particular
    account number using the indexOf() method of ListBuffer and then deletes that particular index
    from all the ListBuffer respectively.*/

    def closing(): Unit ={
      println("Enter the account number: ")
      try{
      val remove_acc = readInt()
      val index_remove = account_number.indexOf(remove_acc)
      names -= names(index_remove)
      balance_amt -= balance_amt(index_remove)
      account_number -= account_number(index_remove)
      println("Account removed successfully")
    }


    }
}
