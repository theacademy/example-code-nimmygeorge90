package FundforFuture
/*This is the parent class which stores the details current account holder.
Here I'm used ListBuffer where index of one's client account number and its corresponding
value stored in same index value of different listbuffer.*/
import scala.collection.mutable.ListBuffer
import scala.io.StdIn.{readInt, readLine}
//The initial details of account holders
class Account {

  var names = new ListBuffer[String]()
  names += ("George", "Shiby", "Nimisha", "Nithya", "Dinu", "Sajo", "Iza", "Iha")
  var  account_number = new ListBuffer[Int]()
  account_number += (2343,1235,6781,1283,5673,2345,9746,2894)
  var sort_code = 102347
  var phone_number = new ListBuffer[Long]()
  phone_number += (9998273493L, 5569392838L, 6651299039L, 7587855724L, 9998273493L, 5569392838L, 6651299039L, 7587855724L)
  var balance_amt = new ListBuffer[Double]()
  balance_amt += (2343,1235,6781,1283,5673,2345,9746,2894)
def get_account(index:Int): Any ={
//This method is used return the details of particular user.
  return println("Account Number :"-> account_number(index),
    "Name:" -> names(index),
    "Balance Amount :" -> balance_amt(index),
    "Phone Number:" ->phone_number(index),
    "sort_code:" -> sort_code)
}
//This method shows the details of all customer
  def show_account_details(): Unit ={
    println("Details of customer is")
    println("Name :"+names)
    println( "Account number " + account_number )
    println("Sort Code" +  sort_code)
    println ("Phone number"  + phone_number)
    println("Balance Amount" +  balance_amt)
  }

   

}

