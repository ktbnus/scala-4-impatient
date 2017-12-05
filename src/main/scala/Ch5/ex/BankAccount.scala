package Ch5.ex

/**
  * Created by Stas on 04/12/2017.
  */
class BankAccount(private var value : Int = 0) {

  def deposit ( ammount : Int) : Unit = value += ammount

  def withdraw ( ammount : Int) : Unit = value -= ammount

  def balance : Int = value

}
