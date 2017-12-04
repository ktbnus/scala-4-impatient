println("arrays")

val nums = new Array[Int](10)

val s = Array("Hello","World")

s(0) = "Good Bye"

s

import collection.mutable.ArrayBuffer

val b = ArrayBuffer[Int]()

b += 1

b += ( 1,2,3,4)

println(b)
b ++= Array(8,13,21)

b.trimEnd(5)

println(b)

b.insert(2,6)

b.insert(2,7,8,9)

b.remove(2)

b.remove(2,3)
val x = b.toArray

val buf = x.toBuffer









