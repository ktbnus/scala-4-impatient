// maps

val scores = Map("Alice" -> 10, "Bob" ->3,
  "cidny" -> 8)

val blankScores = scala.collection.mutable.Map[String,Int]()

("some" -> 10)

val otherScores = Map(("Alice",10),("Bob",3),("Cidny",8))

val bobScore = scores("Bob")
val alice = "Alice"
val aliceScore = scores(alice)

val bScore = if ( scores.contains("Bob")) scores("Bob")
            else 0

def test = {
  println("Testing")
  0
}

// test is evaluated lazy
val bobScores = scores.getOrElse("Bob", test)

// returns option
val aScore = scores.get("Alice")

// map with default values
val scores1 = scores.withDefaultValue(-99)

// return none
val zeldaScore = scores1.get("zelda")

// return default -99
val zScore = scores1("zelda")

val scores2 = scores.withDefault(_.length)

// returns the length of zelda
val zScore2 = scores2("zelda")






