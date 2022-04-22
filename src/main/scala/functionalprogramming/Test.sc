//def double(i: Int): Int = i * 2
//
//def sum(list: List[Int]): Int = list match {
//  case Nil => 0
//  case head :: tail => head + sum(tail)
//}
//
//val nums = (1 to 10).toList
//
//val doubles = nums.map(_ * 2)
//val lessThanFive = nums.filter(_ < 5)
//
//val doubles = nums.map(_ * 2)
//
//def double(i: Int): Int = i * 2
//val doubles = nums.map(double)
//
//List("foo", "bar").map(_.toUpperCase)
//List("foo", "bar").map(_.capitalize)
//List("adam", "scott").map(_.length)
//List(1,2,3,4,5).map(_ * 10)
//List(1,2,3,4,5).filter(_ > 2)
//List(5,1,3,11,7).takeWhile(_ < 6)
//
//def toUpper(s: String): String = s.toUpperCase
//
//List("foo", "bar").map(toUpper)
//
//List("foo", "bar").map(s => toUpper(s))
//
//List("foo", "bar").map(s => s.toUpperCase)
//List("foo", "bar").map(_.toUpperCase)
//
//def toInt(s: String): Int = {
//  try {
//    Integer.parseInt(s.trim)
//  } catch {
//    case e: Exception => 0
//  }
//}
//
def toInt(s: String): Option[Int] = {
  try {
    Some(Integer.parseInt(s.trim))
  } catch {
    case e: Exception => None
  }
}

val a = toInt("1")

val a = toInt("foo")

toInt("2") match {
  case Some(i) => println(i)
  case None => println("That didn't work.")
}

val stringA = "abc"
val stringB = "2"
val stringC = "3"

val y = for {
  a <- toInt(stringA)
  b <- toInt(stringB)
  c <- toInt(stringC)
} yield a + b + c

// prints 1
toInt("1").foreach(println)

// prints nothing (literally)
toInt("x").foreach(println)

toInt("x") match {
  case Some(i) => println(i)
  case None => println("That didn't work.")
}

class Address (
              var street1: String,
              var street2: Option[String],
              var city: String,
              var state: String,
              var zip: String
              )

val santa = new Address(
  "1 Main Street",
  None,
  "NorthPole",
  "Alaska",
  "99705"
)

val santa = new Address(
  "123 Main Street",
  Some("Apt. 2B"),
  "Talkeetna",
  "Alaska",
  "99676"
)

class Person(var name: String, var age: Int)

object Person {
  def unapply(p: Person): String = s"${p.name}, ${p.age}"
}

val p = new Person("Lori", 29)

val result = Person.unapply(p)

object Person {
  def unapply(p: Person): Tuple2[String, Int] = (p.name, p.age)
}

val result = Person.unapply(p)