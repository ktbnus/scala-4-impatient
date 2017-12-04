def lteqgt ( values : Array[Int], v: Int) = {
  (values.filter(_<v), values.filter(_ == v),
    values.filter(_>v))
}

def prn(x: TraversableOnce[_]) = println(x.mkString(x.getClass.getSimpleName + "(", ", ", ")"))

val arr = Array(1,2,3,4,5,5,6,7,8)

val x = lteqgt(arr,5)
println(x._1)

println(x._1.mkString(","))