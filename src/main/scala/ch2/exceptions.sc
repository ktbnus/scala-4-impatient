//http://jsuereth.com/scala-arm/

import java.io.IOException
import java.net.{MalformedURLException, URL}


print("Exceptions")

// Result of Exception excpression is Nothing

val x = 10

def check(x:Int) = if ( x > 0) math.sqrt(x) else {
  throw new IllegalArgumentException("fds")
}

def process(url: URL) {}

val url = new URL("http://google.com")

try {
  process(url)
} catch {
  case _: MalformedURLException => print("Bad url!")
  case ex : IOException => ex.printStackTrace()
} finally {
  // close stream
}
