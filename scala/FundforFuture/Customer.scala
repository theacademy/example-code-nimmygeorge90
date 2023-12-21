package FundforFuture

import scala.io.StdIn.readInt

import scala.io.StdIn.{readInt, readLine}
import scala.collection.mutable
//Here we use
abstract class Customer(id:Int,first:String,last:String) extends Account {


  final val customer_id: Int = id
  var email: String
  val firstname: String = first
  val lastname: String = last
  var age: Int = 1


  def this(id: Int, firstname: String, lastname: String, cus_age: Int) {
    this(id, firstname, lastname)
    age = cus_age
  }

  def this(id: Int, firstname: String, lastname: String, cus_age: Int, cus_email: String) {
    this(id, firstname, lastname)
    age = cus_age
    email = cus_email
  }

}


object customerMain extends App{ //Main object of the project


  // Object of all classes
  val obj0 = new LoginPage()
  val obj1 = new DepositWithdraw(100)
  val obj2 = new OpeningClosing()
  val obj3 = new Readingfiles()


  //def Bank_main(): Unit = {

  println("Welcome")
  println("0.Login User\n"+
    "\n1.Deposit to Account \n" +
    "\n2.Withdraw from Account \n" +
    "\n3.Opening the Account \n" +
    "\n4.Closing the Account\n"+
    "\n5.Standrd Rules of Bank\n")
  val choice: Int = readInt()
  //Here used case, to call the different objects and methods
  choice match {
    case 0 => obj0.login(); //Login page for the user
    case 1 => obj1.deposit(100)//calling credit method to credit amount and implement the test case
    case 2 => obj1.withdraw(10)//calling debit method to debit amount and implement the test case
    case 3 => obj2.opening()//calling opening method to open an account
    case 4 => obj2.closing()// calling closing method to close the account
    case 5 => obj3.fileread()//This is the file reader
    case _ => "other"
    // }
  }
}

