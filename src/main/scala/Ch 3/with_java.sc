val a = Array("Marry","a", "had", "lamb", "little")


java.util.Arrays.binarySearch(a.asInstanceOf[Array[Object]],"beef")
java.util.Arrays.binarySearch(a.asInstanceOf[Array[Object]],"had")


import scala.collection.Searching._
val result = a.search("beef")

val res2 = a.search("had")

