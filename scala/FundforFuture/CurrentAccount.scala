package FundforFuture
import scala.io.StdIn.{readInt, readLine}
/*This is child class of account class, here also debit the money when user needs, first it
check overdrift limit which is nothing but the minimum limit set by the bank that requires
 every account to have the balance above that overdraft limit in order to avoid cash deduction.
 */

  class CurrentAccount extends Account {
    var overdraft_limit: Int = 2000//setting overdift limit
      def current_debit(): Unit = {
      println("Enter the account number from witdraw")//getting account number and amount
      val current_account = readInt()
      val index_current = account_number.indexOf(current_account)
      println("Enter the amount you want to withdraw: ")
      var debit_amount = readInt()
      if (balance_amt(index_current) - debit_amount < 2000) {//Checking Overdraft limit exceeded
        println("Overdraft limit exceeded ,transaction declined")
      }
      else {
        balance_amt(index_current) -= debit_amount
        println("Transaction successful\n" + "" +
          "Remaining balance is: " +
          balance_amt(index_current))
      }
    }


}
