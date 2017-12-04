val a = Array(1,2,3,4,5)

for ( i<- 0 until a.length)
  println(s"$i : ${(i)}")

for ( i<- a.indices)
  println(i)

for ( elem <- a) println( elem)


// transforming
val x = for( elm <- a if elm % 2 == 0) yield elm *2

val y = a.filter( _ % 2 == 0).map(_.toString)

a.sum


a.reverse.sorted

val arr = Array(9,6,7,8,4,3,5,6,1,2,5,3,8,9,0,6)

arr.sortWith(_ > _)
arr.sortWith(_ < _)
arr.min

a.mkString
a.mkString(",")
a.mkString(end=">",start = "<",sep=",")

a.toString

val matrix = Array.ofDim[Double](3,4)

matrix(0)
matrix(0)(0)

val triangle = new Array[Array[Int]](10)

for( i <- triangle.indices)
    triangle(i) = new Array[Int](i+1)

println(triangle.mkString)