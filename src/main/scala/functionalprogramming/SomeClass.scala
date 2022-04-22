package functionalprogramming

object SomeClass {
  private val HiddenFilename = "/tmp/foo.bar"
}

class SomeClass {
  def printFilename() = {
    println(SomeClass.HiddenFilename)
  }
}
