/**
  * Created by Rig on 1/12/2016.
  */
object HelloWorld {
  def main(args: Array[String]): Unit = {

    getinput
  }

  def getinput: Unit = {
    val a = io.Source.stdin.next()
    if (a == 'a')
      println("A")
    else
      println("B")
  }
}

