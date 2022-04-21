package scalaclasses

object PizzaTest extends App {
  val p = new Pizza(crustType = RegularCrustType, crustSize = LargeCrustSize)
  p.addTopping(Cheese)
  p.addTopping(Pepperoni)
  p.removeTopping(Sausage)
  p.removeAllToppings()
  println(p)
}
