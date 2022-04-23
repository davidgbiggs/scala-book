import scala.concurrent.Future

def aShortRunningTask(): Int = 42
val x = aShortRunningTask
def aLongRunningTask(): Future[Int] = ???
val x = aLongRunningTask

