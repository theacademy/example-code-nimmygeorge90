package FundforFuture

import scala.collection.mutable.ListBuffer
import scala.io.StdIn.readInt
import java.sql._
//This is the login page where customer can login to the account using username and password.
//The logged users details are in user class and loginpage extends from user class

class LoginPage extends Users {
  def login(): Unit = {
    println("Enter the username")
    val entered_username: Any = scala.io.StdIn.readLine()
    val index_username = username.indexOf(entered_username)
    if (index_username == -1) {//checking the index value is -1 then it is invalid user
      println("Invalid Username")
      //return index_username
    } else {
      println("Enter the Password")// enter password and compare it with password already saved in user
      val entered_password: Any = scala.io.StdIn.readLine()
      val value_password = password(index_username)

      if (value_password.equals(entered_password)) {
        // val logged_user = Map("index" -> index_username, "Name" -> Name(index_username))
        //return index_username

        val driver = "com.mysql.jdbc.Driver"
        val url = "jdbc:mysql://localhost:3306/Fundforfuture"
        val username = "root"
        val password = "root"

        // connection instance creation
        var connection: Connection = null
        try {
          Class.forName(driver)

          connection = DriverManager.getConnection(url, username, password)
          val statement = connection.createStatement()//checking with sql statements weather the user_id and index username is same
          val resultSet = statement.executeQuery(s"select customer_id,firstname,lastname,email,age,created_at from customers where users_id = ${index_username} ;")
          while (resultSet.next()) {// If the it Success it shows details of customer
            val customer_id = resultSet.getInt("customer_id")
            val firstname = resultSet.getString("firstname")
            val lastname = resultSet.getString("lastname")
            val email = resultSet.getString("email")
            val age = resultSet.getString("age")
            val created_at = resultSet.getString("created_at")
            println("Successfully Login")
            println(s"customer_id is: $customer_id \n firstname is :$firstname \nlastname is :$lastname \n" +
              s"email is :$email \n age is :$age \n created_at is :$created_at")
          }

        } catch {case e:SQLInvalidAuthorizationSpecException=>println("Invalid Password")
          //println()
          //return -1
        }
      }
    }
  }
}

