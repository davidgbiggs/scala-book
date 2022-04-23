//case class Person(name: String, relation: String)

//val christina = Person("Christina", "niece")

// accessor method auto-generated:
// christina.name

// can't mutate the 'name' field. invalid:
// christina.name = "Fred"

//trait Person {
//  def name: String
//}
//
//case class Student(name: String, year: Int) extends Person
//case class Teacher(name: String, specialty: String) extends Person
//
//def getPrintableString(p: Person): String = p match {
//  case Student(name, year) =>
//    s"$name is a student in Year $year."
//  case Teacher(name, whatTheyTeach) =>
//    s"$name teaches $whatTheyTeach"
//}
//
//val s = Student("Al", 1)
//val t = Teacher("Bob Donnan", "Mathematics")

//getPrintableString(s)
//getPrintableString(t)

case class BaseballTeam(name: String, lastWorldSeriesWin: Int)

val cubs1908 = BaseballTeam("Chicago Cubs", 1908)
val cubs2016 = cubs1908.copy(lastWorldSeriesWin = 2016)

case class Person(name: String, relation: String)

val christina = Person("Christina", "niece")

val hannah = Person("Hannah", "niece")

// false
christina == hannah

val test1 = Person("test", "test")
val test2 = Person("test", "test")
test1 == test2

sealed trait Topping
case object Cheese extends Topping
case object Pepperoni extends Topping
case object Sausage extends Topping
case object Mushrooms extends Topping
case object Onions extends Topping

sealed trait CrustSize
case object SmallCrustSize extends CrustSize
case object MediumCrustSize extends CrustSize
case object LargeCrustSize extends CrustSize

sealed trait CrustType
case object RegularCrustType extends CrustType
case object ThinCrustType extends CrustType
case object ThickCrustType extends CrustType

case class Pizza (
  crustSize: CrustSize,
  crustType: CrustType,
  toppings: Seq[Topping]
)

case class StartSpeakingMessage(textToSpeak: String)
case object StopSpeakingMessage
case object PauseSpeakingMessage
case object ResumeSpeakingMessage

// code you might see if you were using Akka
//class Speak extends Actor {
//  def receive = {
//    case StartSpeakingMessage(textToSpeak) =>
//      // code to speak the text
//    case StopSpeakingMessage =>
//      // code to stop speaking
//    case PauseSpeakingMessage =>
//      // code to pause speaking
//    case ResumeSpeakingMessage =>
//      // code to resume speaking
//  }
//}

def toInt(s: String): Option[Int] = {
  try {
    Some(Integer.parseInt(s.trim))
  } catch {
    case e: Exception => None
  }
}
val x = "2"
toInt(x) match {
  case Some(i) => println(i)
  case None => println("That didn't work")
}

val y = for {
  a <- toInt("1")
  b <- toInt("2")
  c <- toInt("3")
} yield a + b + c

import scala.util.{Try, Success, Failure}

def toInt(s: String): Try[Int] = Try {
  Integer.parseInt(s.trim)
}

def toInt(s: String): Try[Int] = Try(Integer.parseInt(s.trim))

toInt(x) match {
  case Success(i) => println(i)
  case Failure(s) => println(s"Failed. Reason: $s")
}

