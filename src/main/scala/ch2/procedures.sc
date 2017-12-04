// functions that return no value - or always returns a Unit

// same as : Unit = {
def box( str : String) {
  val border = "-" * (str.length + 2)
  print(f"$border%n|$str|%n$border%n")
}

box("hello world")

// lazy evaluation
lazy val words = (1 to 10).mkString


/*
// evaluated first time wordsFile is used
lazy val wordsFile = scala.io.Source.fromFile("/usr/share/words").mkString

// evaluated when is defined
val wordsFile1 = scala.io.Source.fromFile("/usr/share/words").mkString

// evaluated everytime it's used.
def  wordsFile2 = scala.io.Source.fromFile("/usr/share/words").mkString
*/

print ( "after words ")

