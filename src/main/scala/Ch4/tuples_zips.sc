val t =(1, 3.14, "Fred")

val second = t._2

val first = t _1


val r = "New York".partition(_.isUpper)
r._1
r _2


// zipping
val symbols = Array("<","-",">")
val counts = Array(2,10,2)
val pairs = symbols.zip(counts)

for ( (s,n) <- pairs) print(s*n)

val m = counts.zip(symbols).toMap
