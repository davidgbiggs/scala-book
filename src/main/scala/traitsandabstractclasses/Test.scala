package traitsandabstractclasses

import java.time.DayOfWeek

object Test extends App {
//  trait TailWagger {
//    def startTail(): Unit
//    def stopTail(): Unit
//  }
//
//  class Dog extends TailWagger {
//    // the implemented methods
//    def startTail(): Unit = println("tail is wagging")
//    def stopTail(): Unit = println("tail is stopped")
//  }
//
//  val d = new Dog
//
//  d.startTail()
//
//  d.stopTail()

//  trait Speaker {
//    def speak(): String
//  }

//  trait TailWagger {
//    def startTail(): Unit
//    def stopTail(): Unit
//  }
//
//  trait Runner {
//    def startRunning(): Unit
//    def stopRunning(): Unit
//  }
//
//  class Dog extends Speaker with TailWagger with Runner {
//    // Speaker
//    def speak(): String = "Woof!"
//
//    // TailWagger
//    def startTail(): Unit = println("tail is wagging")
//    def stopTail(): Unit = println("tail is stopped")
//
//    // Runner
//    def startRunning(): Unit = println("I'm running")
//    def stopRunning(): Unit = println("Stopped running")
//  }

//  trait Pet {
//    def speak = println("Yo")
//    def comeToMaster(): Unit
//  }

//  class Dog(name: String) extends Pet {
//    def comeToMaster(): Unit = println("Woo-hoo, I'm coming!")
//  }
//
//  val d = new Dog("Zeus")
//  d.speak
//  d.comeToMaster

//  class Cat extends Pet {
//    override def speak(): Unit = println("meow")
//    def comeToMaster(): Unit = println("That's not gonna happen.")
//  }
//
//  val c = new Cat
//  c.speak
//  c.comeToMaster

//  trait Speaker {
//    def speak(): String
//  }
//
//  trait TailWagger {
//    def startTail(): Unit = println("tail is wagging")
//    def stopTail(): Unit = println("tail is stopped")
//  }
//
//  trait Runner {
//    def startRunning(): Unit = println("I'm running")
//    def stopRunning(): Unit = println("Stopped running")
//  }

//  class Dog(name: String) extends Speaker with TailWagger with Runner {
//    def speak(): String = "Woof!"
//  }
//
//  class Cat extends Speaker with TailWagger with Runner {
//    def speak(): String = "Meow"
//    override def startRunning(): Unit = println("Yeah ... I don't run")
//    override def stopRunning(): Unit = println("No need to stop")
//  }
//
//  val d = new Dog("Zeus")
//  d.speak
//  d.startRunning
//  d.startTail
//
//  val c = new Cat
//  c.speak
//  c.startRunning
//  c.startTail

//  class Dog(name: String)
//
//  val d = new Dog("Fido") with TailWagger with Runner
//  d.startTail
//  d.startRunning

//  abstract class Pet (name: String) {
//    def speak(): Unit = println("Yo") // concrete implementation
//    def comeToMaster(): Unit // abstract method
//  }
//
//  class Dog(name: String) extends Pet(name) {
//    override def speak() = println("Woof")
//    def comeToMaster() = println("coming to master")
//  }

  abstract class Pet (name: String) {
    def speak: Unit = println(s"My name is $name")
  }

  class Dog(name: String) extends Pet(name)

  val d = new Dog("Fido")
  d.speak
}
