package Ch8_Inheritance.ex.ex1

class BackAccount(initialeBalance: Double) {
  private var balance = initialeBalance;

  def currentBalance = balance;

  def deposite(ammount: Double) = {
    balance += ammount;
    balance
  }

  def withdraw(ammount: Double) = {
    balance -= ammount;
    balance
  }

  override def toString: String = "Balance = %f".format(balance)
}
