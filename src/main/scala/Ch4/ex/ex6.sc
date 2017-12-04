val freq = scala.collection.mutable.LinkedHashMap[String, Int]()

freq += ("Sunday" ->5)
freq += ("Sunday5" -> 0)
freq += ("Sunday2" -> 10)



for ((k,v) <- freq ) println( s"($k,$v)" )




