//import scalacollections.Person
//
//import scala.collection.mutable.ArrayBuffer
//
//val ints = ArrayBuffer[Int]()
//val names = ArrayBuffer[String]()
//
//ints += 1
//ints += 2
//
//val nums = ArrayBuffer(1,2,3)
//nums += 4
//nums += 5 += 6
//nums ++= List(7, 8, 9)
//
//nums -= 9
//nums -= 7 -= 8
//nums --= Array(5, 6)
//
//val a = ArrayBuffer(1, 2, 3)
//a.append(4)
//a.appendAll(Seq(5, 6))
//a.clear
//
//val a = ArrayBuffer(9, 10)
//a.insert(0, 8)
//a.insertAll(0, Vector(4, 5, 6, 7))
//a.prepend(3)
//a.prependAll(Array(0, 1, 2))
//
//val a = ArrayBuffer.range('a', 'h')
//a.remove(0)
//a.remove(2, 3)
//
//val a = ArrayBuffer.range('a', 'h')
//a.dropInPlace(2)
//a.dropRightInPlace(2)
//
//val ints = List(1,2,3)
//val names = List("Joel", "Chris", "Ed")
//
//val ints: List[Int] = List(1, 2, 3)
//val names: List[String] = List("Joel", "Chris", "Ed")
//
//val a = List(1,2,3)
//val b = 0 +: a
//
//val b = List(-1, 0) ++: a
//
//val names = List("Joel", "Chris", "Ed")
//for (name <- names) println(name)
//
//val nums = Vector(1, 2, 3, 4, 5)
//val string = Vector("one", "two")
//
//val peeps = Vector(
//  Person("Bert"),
//  Person("Ernie"),
//  Person("Grover")
//)
//
//val a = Vector(1,2,3)
//val b = a :+ 4
//val b = a ++ Vector(4, 5)
//
//val b = 0 +: a
//val b = Vector(-1, 0) ++: a
//
//for (name <- names) println(name)
//
//val states = Map(
//  "AK" -> "Alaska",
//  "IL" -> "Illinois",
//  "KY" -> "Kentucky"
//)
//
//import scala.collection.mutable.Map
//
//val states = collection.mutable.Map("AK" -> "Alaska")
//
//states += ("AL" -> "Alabama")
//
//states += ("AR" -> "Arkansas", "AZ" -> "Arizona")
//
//states ++= Map("CA" -> "California", "CO" -> "Colorado")
//
//states -= "AR"
//states -= ("AL", "AZ")
//states --= List("AL", "AZ")
//
//states("AK") = "Alaska, A Really Big State"
//
//val ratings = Map(
//  "Lady in the Water" -> 3.0,
//  "Snakes on a Plane" -> 4.0,
//  "You, Me and Dupree" -> 3.5
//)
//
//for ((k, v) <- ratings) println(s"key: $k, value: $v")
//
//ratings.foreach {
//  case(movie, rating) => println(s"key: $movie, value: $rating")
//}
//
//val set = scala.collection.mutable.Set[Int]()
//
//set += 1
//set += 2 += 3
//set ++= List(4,5)
//
//// ignored
//set += 2
//
//set.add(6)
//// true
//set.add(5)
//// false
//
//val set = scala.colletion.mutable.Set(1, 2, 3, 4, 5)
//
//set -= 1
//
//set -= (2, 3)
//
//set --= Array(4, 5)
//
//val set = scala.collection.mutable.Set(1, 2, 3, 4, 5)
//
//set.clear()
//
//// empty
//set
//
//val set = scala.collection.mutable.Set(1, 2, 3, 4, 5)
//
//// true
//set.remove(2)
//
//set
//// Set(1, 4, 3, 5)
//
//set.remove(49)
//// false
//
//val ints = List(1,2,3)
//val ints = List.range(1, 10)
//
//val doubledInts = ints.map(_ * 2)
//
//val doubledInts = ints.map((i: Int) => i * 2)
//
//val ints = List.range(1, 10)
//val x = ints.filter(_ > 5)
//val x = ints filter (_ < 5)
//val x = ints.filter(_ % 2 == 0)
//
//
//val ints = List(1,2,3)
//def double(x: Int) = x * 2
//val x = ints.map(double)

val nums = (1 to 10).toList
nums.filter(num => num < 5 || num > 5)

def add(x: Int, y: Int): Int = {
  val theSum = x + y
  println(s"received $x and $y, their sum is $theSum")
  theSum
}

val a = List(1,2,3,4)

a.reduce(add)

val m = Map(
  1 -> "a",
  2 -> "b",
  3 -> "c",
  4 -> "d"
)

for ((k, v) <- m) printf("key: %s, value: %s\n", k, v)

val keys = m.keys

val values = m.values

val contains3 = m.contains(3)

val ucMap = m.transform((k,v) => v.toUpperCase)

val twoAndThree = m.view.filterKeys(Set(2,3)).toMap

val firstTwoElements = m.take(2)

val states = scala.collection.mutable.Map(
  "AL" -> "Alabama",
  "AK" -> "Alaska"
)

// add elements with +=
states += ("AZ" -> "Arizona")
states ++= Map("CO" -> "Colorado", "KY" -> "Kentucky")

// remove elements with -=
states -= "KY"
states --= List("AZ", "CO")

// update elements by reassigning them
states("AK") = "Alaska, The Big State"

// filter elements by supplying a function that operates on
// the keys and/or values
states.filterInPlace((k,v) => k == "AK")