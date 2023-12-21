package FundforFuture
import scala.io.StdIn.{readInt, readLine}//Library to import readInt
import scala.util.Random
object BankMain extends App{ //Main object of the project


      // Object of all classes

      val obj1 = new Account()
      val obj2 = new DepositWithdraw(100)
      val obj3 = new SavingsAccount()
      val obj4 = new CurrentAccount()
      val obj5 = new OpeningClosing()
     val obj6 = new Readingfiles()


    //def Bank_main(): Unit = {

      println("Welcome")

  println("\n1.account details\n" +//Display account details
        "\n2.Interest Amount\n " +//Calculate interest
        "\n3.Deposit to Account \n" +
        "\n4.Withdraw from Account \n" +
        "\n5.Opening the Account \n" +
        "\n6.Closing the Account\n"+
        "\n7.Generate Account Number\n"+
         "\n8. To see details of particular user")
      val choice: Int = readInt()
      //Here used case, to call the different objects and methods
      choice match {
        //case 0 => obj0.login(); //Bank_main()
        case 1 => obj1.show_account_details() //calling account details
        case 2 => obj3.calculate_interest(100) //calling interest method ,and also implement test case are performed the activity
        case 3 => obj2.deposit(100)//calling credit method to credit amount,and also implement test cases for the deposits
        case 4 => obj2.withdraw(10)//calling debit method to debit amount and also implement test cases for the withdraw
        case 5 => obj5.opening()//calling opening method to open an account
        case 6 => obj5.closing()// calling closing method to close the account
        case 7 => obj5.generate_account_number()//calling generate account number randomlyalso implement test cases
        case 8 => obj3.show_account_details() //to print the details of particular user
        case _ => "other"
     // }
  }
  }

