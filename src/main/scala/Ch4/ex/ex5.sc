import java.util
import java.util.Scanner

import scala.collection.JavaConversions.mapAsScalaMap
var countMap : scala.collection.mutable.Map[String,Int] = new
  util.TreeMap[String,Int]

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val in = new Scanner(new java.io.File("/Users/user1/Desktop/connections.log"))
while(in.hasNext()) {
  val word = in.next()

   countMap(word) = countMap.getOrElse(word,0) + 1
}


for((k,v) <- countMap) println( s"$k : $v")

println(countMap.keys.size)

//prn(countMap)