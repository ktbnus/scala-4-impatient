import java.text.MessageFormat

def abs ( x: Double) = if ( x >= 0) x  else -x
abs(-9)

def fac ( n : Int) = {
  var r = 1
  for ( i<- 1 to n) r = r * i
  r
}

fac ( 10 )


def rfac( n : Int) : Int = {
  if ( n <= 0) 1 else n * rfac(n-1)
}

rfac(10)


// Default and named arguments

def decorate ( str : String, left: String ="[", right : String ="]") =
  left + str + right

// ^^ left and right have default values

decorate("hello world")

decorate("hello", "<")
decorate("hello", "<",">")

// with named argument
decorate(left ="<<<", str = "world", right = ">>>")
decorate(left ="<<<", str = "world")
decorate("String", right = "]<<<")

// Variable arrguments

def sum( args : Int*) = {
  var result = 0
  for ( arg <- args) result += arg
  result
}

sum(2)
sum(1,2,3,4,5)

// send the Range and an argument sequence
val s = sum ( 1 to 5 : _ *)


def recursiveSum( args : Int *) : Int = {
  if ( args.length == 0) 0
  else args.head + recursiveSum(args.tail : _*)
}

recursiveSum(1,2,3,4,5)

val str = MessageFormat.format("The answer to {0} is {1}",
  "everything", 42.asInstanceOf[AnyRef])


