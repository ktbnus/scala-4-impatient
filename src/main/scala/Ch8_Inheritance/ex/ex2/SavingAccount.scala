package Ch8_Inheritance.ex.ex2

import Ch8_Inheritance.ex.ex1.BackAccount

class SavingAccount(initialiBalance: Double,
                    val freeTransactions: Double = 3,
                    val comission: Double = 1,
                    val intrestRate: Double = 0.1)
  extends BackAccount(initialiBalance) {
  val isFreeTransaction = transactionThisMounth <= freeTransactions
  private var _transactionThisMounth = 0

  def transactionThisMounth = _transactionThisMounth

  override def deposite(ammount: Double): Double = {
    _transactionThisMounth += 1
    super.deposite(ammount - (if (isFreeTransaction) 0 else comission))
  }

  override def withdraw(ammount: Double): Double = {
    _transactionThisMounth += 1
    super.deposite(ammount + (if (isFreeTransaction) 0 else comission))
  }

  def earnMonthlyInterest() = {
    _transactionThisMounth = 0
    super.deposite(currentBalance * intrestRate)
  }
}
