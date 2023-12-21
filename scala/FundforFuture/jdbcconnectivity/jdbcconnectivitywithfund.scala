package FundforFuture.jdbcconnectivity
import java.sql._
//This is object is to connect jdbc mysql,
object jdbcconnectivitywithfund extends App {


  val driver = "com.mysql.jdbc.Driver"// //Mentioning JDBC driver name.
  val url = "jdbc:mysql://localhost:3306/Fundforfuture"//The url which iclude port and data
  val username = "root"//Entered the username
  val password = "root"//The password

  // connection instance creation
  var connection: Connection = null
  try { //Apply try catch exception
    Class.forName(driver)
    connection = DriverManager.getConnection(url, username, password)

    val statement = connection.createStatement() //declare the statement for connection


    //Inserting the values into table
     var insertsql = "INSERT INTO customers(users_id,firstname,lastname,email,age,created_at) values(?,?,?,?,?,CURRENT_TIMESTAMP);"

    val preparedStatement: PreparedStatement = connection.prepareStatement(insertsql)

    preparedStatement.setInt(1, 101)
    preparedStatement.setString(2, "Ila")
    preparedStatement.setString(3, "Mariya")
    preparedStatement.setString(4, "ilamariya@gmail.com")
    preparedStatement.setInt(5, 7)
    preparedStatement.execute()
    preparedStatement.setInt(1, 102)
    preparedStatement.setString(2, "Ika")
    preparedStatement.setString(3, "elsa")
    preparedStatement.setString(4, "ikaelsa@gmail.com")
    preparedStatement.setInt(5, 20)
    preparedStatement.execute()

    //Selecting command
    val resultSet = statement.executeQuery("select * from fund_customers; ")
    while (resultSet.next()) {
      val customer_id = resultSet.getString("customer_id")
      val firstname = resultSet.getString("firstname")
      println(s"customer_id is $customer_id and firstname is $firstname")
  //Add a column to the table fund_customer
    //  val updatesql = statement.executeQuery("ALTER TABLE  fund_customer  ADD column user_id INT(5) AFTER customer_id ;")

    }

  } catch {
    case e: Exception => e.printStackTrace()
  }
  finally {
    connection.close()
  }
}

