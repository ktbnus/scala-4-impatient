/* Ex 10 */

def myPow ( x : Double, n : Double) : Double = {
  if( n == 0) 1 else if ( n == 1 ) x
  else{
    if ( n < 0 ) 1 / myPow(x,-n)
    else if ( n % 2 == 0  && n > 2) myPow( myPow(x,n/2),2)
    else x * myPow(x,n-1)
  }
}

println("math pow " + math.pow(2,10))
println("my pow " + myPow(2,10))

/* Ex 11 */

// http://www.monadzoo.com/blog/2013/01/06/scala-string-interpolation-it-happened

/* Ex 1 */

def signum ( n : Int) = {
  if ( n > 0) 1
  else if ( n < 0) -1
  else 0
}

println(signum(9))


/* Ex 2 */

{} // type of Unit
var x: Any = 4

/* Ex 3 */
println("Ex 3")
var y = 1

x = y = 1

println("x is " + x)


/* Ex 4*/
10 to 0 by -1
for ( i<- 10 to 0 by -1) println(i)

val range = Range(10, 0, -1)
for ( i<- range) println(i)


/* Ex 5 */

def countDown( n: Int)  {
  for ( i <- n to 0 by -1) println(i)
}

countDown(21)


/* Ex 6 */

var prod : Long = 1
for ( ch <- "Hello"){
  prod *= ch.toLong
}

println("prod: " + prod)


/* Ex 7 + 8 */


def prodStr ( str : String) : Long ={
  str.foldRight(1L)(op = (x, y) => x.toLong * y)
}

print(prodStr("Hello"))


/* Ex 9 */
def prodStrRec ( str : String) : Long = {
  if ( str.length == 0) 1L
  else str.head.toLong * prodStrRec(str.tail)
}

println(prodStrRec("Hello"))

