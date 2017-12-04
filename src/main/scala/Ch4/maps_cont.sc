val scores = scala.collection.mutable.Map("Alice" -> 10,("Bob",5))

scores("Bob") = 10

scores.get("Bob")

scores("Fred") = 17

// adding some more
scores += ("Bob" ->99, "Fred"->99, "Mia"->100)

scores -= "Alice"


val imScores = Map("Stas"->100)

// gets a new map
val newScores = imScores + ("Bob"->99)

val x = scores + ("Chuk" ->1000)

val y = x + ("popo"->100)

/// iterating

for ((k,v)<- scores) println( k + " " + v)

scores.keys
scores.keySet

scores.values

// reverse keys and values
for( (k,v) <- scores) yield (v,k)

// sorted -> tree map
val sortedScores = scala.collection.mutable.SortedMap(
  "Alice"->1,"Bob"->2,"Cidny"->3)

// insertion order
val months = scala.collection.mutable.LinkedHashMap(
  "jan"->1, "Feb"->2)


// With Java
import java.util

import scala.collection.JavaConverters._
val jScores : scala.collection.mutable.Map[String,Int] = new java.util.TreeMap[String,Int]


