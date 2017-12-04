 // Ex 1
import scala.util.Random

val n = 10
val a1 = for( i <- 0 to n) yield Random.nextInt(n)

// Ex 4
val arr = Array(1,0,-9,2,3,-8,4,5,-1,0,100, 2,4,6,-9,-6,-4,0)
 val pos = arr.filter(_ >0)
 val neg = arr.filterNot( _ > 0)
 val res1 = pos ++: neg
 val res2 = pos ++ neg


 // Ex 5

 val avg = arr.sum / arr.length

 // Ex 6

 arr.sorted.reverse
 arr.sortWith(_>_)

 //Ex 7 - remove duplicate

 arr.distinct



 val a = Array(51,-42,30,-4,25,-51,8,42)
 val res = for (i <- 0 until a.length if (i<=a.indexWhere(_<0)||a(i)>0)) yield a(i)