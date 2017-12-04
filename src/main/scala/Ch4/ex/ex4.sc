import java.util.Scanner

import scala.collection.SortedMap

var countMap = SortedMap[String,Int]()

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val in = new Scanner(new java.io.File("/Users/user1/Desktop/connections.log"))
while(in.hasNext()) {
  val word = in.next()

  countMap = countMap + (word -> (countMap.getOrElse(word,0) + 1 ) )

}


for((k,v) <- countMap) println( s"$k : $v")

println(countMap.keys.size)

//prn(countMap)