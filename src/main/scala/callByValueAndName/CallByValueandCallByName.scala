package callByValueAndName

/**
 * @author Tanmoy Mukherjee
 */
object CallByValueandCallByName {

  def callByValue(x:Int,y:String): Unit ={
    println(s"Value of x is :: $x")
    println(s"Value of y is :: $y")
  }

  def callByName(x:Int,y: =>String): Unit ={
    println(s"Value of x is :: $x")
    //println(s"Value of y is :: $y")
    //println(s"Value of y is :: $y")
  }

  def infinite():String = "This is infinite" + infinite

  def main(args: Array[String]): Unit = {
    //callByValue(2,"TANMOY")
    //callByName(10,UUID.randomUUID().toString)
    callByName(10,infinite)
   // callByValue(10,infinite)
  }

}
