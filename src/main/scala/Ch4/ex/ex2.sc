import java.util.Scanner

val countMap = new scala.collection.mutable.HashMap[String,Int]

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val in = new Scanner(new java.io.File("/Users/user1/Desktop/connections.log"))
while(in.hasNext()) {
  val word = in.next()
  if ( countMap.contains(word)) countMap(word) += 1
  else countMap(word) = 1
}


//for((k,v) <- countMap) println( s"$k : $v")

prn(countMap)