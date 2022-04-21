import java.io.FileNotFoundException
// expression
// val minValue = if (a < b) a else b


// statements
// if (a == b) doSomething()
// println("Hello")

val nums = Seq(1,2,3)
for (n <- nums) println(n)

val people = List(
  "Bill",
  "Candy",
  "Karen",
  "Leo",
  "Regina"
)

for (p <- people) println(p)

people.foreach(println)

val ratings = Map(
  "Lady in the Water" -> 3.0,
  "Snakes on a Plane" -> 4.0,
  "You, Me and Dupree" -> 3.5
)

for ((name, rating) <- ratings) println(s"Movie: $name, Rating: $rating")

ratings.foreach {
  case(movie, rating) => println(s"key: $movie, value: $rating")
}

val nums = Seq(1,2,3)
val doubledNums = for (num <- nums) yield num*2


val names = List("adam", "david", "frank")
val ucNames = for (name <- names) yield name.capitalize

val names = List("_adam", "_david", "_frank")

val capNames = for (name <- names) yield {
  val nameWithoutUnderscore = name.drop(1)
  val capName = nameWithoutUnderscore.capitalize
  capName
}

val i = 10

val monthName = i match {
  case 1 => println("January")
  case 2 => println("February")
  case 3 => println("March")
  case 4 => println("April")
  case 5 => println("May")
  case 6 => println("June")
  case 7 => println("July")
  case 8 => println("August")
  case 9 => println("September")
  case 10 => println("October")
  case 11 => println("November")
  case 12 => println("December")
  // catch the default with a varaible so you can print it
  case _ => println("Invalid month")
}

def convertBooleanToStringMessage(bool: Boolean): String = {
  if (bool) "true" else "false"
}

convertBooleanToStringMessage(true)
convertBooleanToStringMessage(false)

def convertBooleanToStringMessage(bool: Boolean): String = bool match {
  case true => "true"
  case false => "false"
}

val result = convertBooleanToStringMessage(true)
println(result)

def isTrue(a: Any) = a match {
  case 0 | "" => false
  case _ => true
}

isTrue(0)
isTrue("")
isTrue(1.1F)
isTrue(new java.io.File("/etc/passwd"))

val evenOrOdd = i match {
  case 1 | 3 | 5 | 7 | 9 => println("odd")
  case 2 | 4 | 6 | 8 | 10 => println("even")
  case _ => println("some other number")
}

val cmd = "go"

cmd match {
  case "start" | "go" => println("starting")
  case "stop" | "quit" | "exit" => println("stopping")
  case _ => println("doing nothing")
}

val count = 0

count match {
  case 1 => println("one, a lonely number")
  case x if x == 2 || x == 3 => println("two's company, three's a crowd")
  case x if x > 3 => println("4+, that's a party")
  case _ => println("i'm guessing your number is zero or less")
}

count match {
  case 1 => println("one, a lonely number")
  case x if (x == 2 || x == 3) => println("two's company, three's a crowd")
  case x if (x > 3) => println("4+, that's a party")
  case _ => println("i'm guessing your number is zero or less")
}

count match {
  case 1 =>
    println("one, a lonely number")
  case x if (x == 2 || x == 3) =>
    println("two's company, three's a crowd")
  case x if (x > 3) => println("4+, that's a party")
  case _ => println("i'm guessing your number is zero or less")
}

count match {
  case 1 | 0 => {
    println("zero or one, lonely numbers")
  }
  case x if x == 2 || x == 3 => {
    println("two's company, three's a crowd")
  }
  case x if x > 3 => {
    println("4+, that's a party")
  }
  case _ => {
    println("I'm guessing you number is negative")
  }
}

i match {
  case a if 0 to 9 contains a => println("0-9 range: " + a)
  case b if 10 to 19 contains b => println("10-19 range: " + b)
  case c if 20 to 29 contains c => println("20-29 range: " + c)
  case _ => println("Hmmm...")
}

case class Stock(symbol: String, price: Int)

val stock = Stock("AAPL", 319)

stock match {
  case x if (x.symbol == "XYZ" && x.price < 20) => println("bought")
  case x if (x.symbol == "XYZ" && x.price < 20) => println("sold")
  case _ => println("did nothing")
}

//var text = ""
//try {
//  text = openAndReadAFile(filename)
//} catch {
//  case e: FileNotFoundException => println("Couldn't find that file.")
//  case e: IOException => println("Had an IOException trying to read that file.")
//}

//try {
  // your scala code here
//} catch {
//  case foo: FooException => handleFooException(foo)
//  case bar: BarException => handleBarException(bar)
//  case _: Throwable => println("Got some other kind of Throwable exception")
//} finally {
  // your scala code here, such as closing a database connection
  // or file handle
//}