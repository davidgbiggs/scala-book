package scalaclasses

class Socket(val timeout: Int = 2000, val linger: Int = 3000) {
  override def toString = s"timeout: $timeout, linger: $linger"
}