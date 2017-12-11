package Ch8_Inheritance.ex.ex1

class CheckingAccount(initialBalance: Double, charge: Double = 1.0)
  extends BackAccount(initialBalance) {
  override def deposite(ammount: Double): Double = super.deposite(ammount - charge)

  override def withdraw(ammount: Double): Double = super.withdraw(ammount + charge)
}
