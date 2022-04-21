package misc

import scala.collection.mutable.ArrayBuffer

class Order (
            var pizzas: ArrayBuffer[Pizza],
            var customer: Customer
) {
  def addPizza(p: Pizza): Unit = pizzas += p
  def removePizza(p: Pizza): Unit = pizzas -= p

  // need to implement these
  def getBasePrice(): Int = ???
  def getTaxes(): Int = ???
  def getTotalPrice(): Int = ???

  def printOrder() = {
    println(s"Order for ${customer.name}:")
    pizzas.foreach(pizza => {
      println(s"$pizza")
    })
  }
}