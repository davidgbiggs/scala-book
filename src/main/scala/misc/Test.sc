val t = (3, "Three", new Person("Al"))

val d = ("Maggie", 30)

case class Person(name: String)
val t = (3, "Three", Person("David"))

t._1
t._2
t._3

val(x, y, z) = (3, "Three", Person("David"))

def getStockInfo = {
  ("NFLX", 100.00, 101.00)
}

val (symbol, currentPrice, bidPrice) = getStockInfo

