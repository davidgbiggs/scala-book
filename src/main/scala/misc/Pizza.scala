package misc
import scala.collection.mutable.ArrayBuffer

class Pizza (
  var crustSize: CrustSize,
  var crustType: CrustType,
  var toppings: ArrayBuffer[Topping]
) {

  def addTopping(t: Topping): Unit = toppings += t
  def removeTopping(t: Topping): Unit = toppings -= t
  def removeAllToppings(): Unit = toppings.clear()

  def getPrice(
              toppingsPrices: Map[Topping, Int],
              crustSizePrices: Map[CrustSize, Int],
              crustTypePrices: Map[CrustType, Int]
              ): Int = ???

  override def toString() = {
    val str = s"""Pizza
      | Crust: $crustSize, $crustType
      | Toppings: $toppings""".stripMargin
    str
  }
}
