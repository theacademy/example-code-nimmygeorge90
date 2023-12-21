package FundforFuture.jdbcconnectivity
import scalikejdbc._
import java.sql._
import scala.collection.immutable._
object jdbcconnectivitywithpool extends App {
//This class is for table creation

  Class.forName("com.mysql.jdbc.Driver")
  val url = "jdbc:mysql://localhost:3306/Fundforfuture"
  try{
  ConnectionPool.singleton(url, "root", "root")

  // ad-hoc session provider on the REPL
  implicit val session = AutoSession

  // table creation, you can run DDL by using #execute as same as JDBC

  sql"""create table customers (
  customer_id serial not null primary key, users_id INT(5),
  firstname varchar(50),lastname varchar(50),email varchar(20),age int(2),
  created_at timestamp not null)""".execute.apply()

    sql"""create table account (
      id serial not null primary key, users_id INT(5),
      account_number INT(20),balance FLOAT(50))""".execute.apply()

  } catch {
    case e: Exception => e.printStackTrace()
  }

}