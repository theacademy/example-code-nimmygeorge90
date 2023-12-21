package FundforFuture
import scala.util._

class DepositWithdraw( Bal: Double) extends Account {

  class Balance(var amount: Double) {

  }

  val balance = new Balance(Bal)

  def withdraw(amount: Double): Either[Unit, String] = this.synchronized {
    if (amount < 0) {
      return Right("Cannot withdraw a negative amount")
    }
    if (amount % 20 != 0) {
      return Right("Not enough funds in account")
    }
    balance.amount -= amount
    Left(())
  }

  def deposit(amount: Double): Either[Unit, String] = this.synchronized {
    if (amount < 0)
      return Right("Negative Amount")
    balance.amount += amount
    Left(())
  }
  def getBalanceAmount: Double       = balance.amount
}