package Ch8_Inheritance

class Creature {
  val range: Int = 10
  val env: Array[Int] = new Array[Int](range)
}

// with early defenition
class Ant extends {
  override val range = 2
} with Creature {
  //  override val range: Int = 2
}

/*
When create a Ant the creature contructor call the Ant's range()
which was not initialize, hence it's value is 0

Don't relay on the value of val in a C'tor

Can set Range to either Final ( limitting ) or lazy ( inefficient )
 or erarly defenition
 */