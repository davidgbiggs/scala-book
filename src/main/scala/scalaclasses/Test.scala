package scalaclasses

object Test {
  def main(args: Array[String]): Unit = {
//    val p = new Person("Bill", "Panner")
//    p.firstName = "William"
//    p.lastName = "Bernheim"
//    println(p.firstName + " " + p.lastName)
//    val p = new Person("kim", "Carnes")
//    println(p.age)
//    p.age = 36
//    println(p)
//    p.printHome()
//    p.printFullName()
//    val p1 = new Pizza(DefaultCrustSize, DefaultCrustType)
//    val p2 = new Pizza(DefaultCrustSize)
//    val p3 = new Pizza(DefaultCrustType)
//    val p4 = new Pizza

    new Socket()
    new Socket(1000)
    new Socket(4000, 6000)
    new Socket(timeout=2000, linger=3000)

    def double(a: Int): Int = a * 2
    double(2)
    double(10)

//    def add(a: Int, b: Int) = a + b
//    def add(a: Int, b: Int): Int = a + b
//    def add(a: Int, b: Int, c: Int): Int = a + b + c

    def addThenDouble(a: Int, b: Int): Int = {
      val sum = a + b
      val doubled = sum * 2
      doubled
    }

    addThenDouble(1, 1)


  }
}
