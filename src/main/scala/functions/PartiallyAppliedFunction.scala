package functions

/**
 * @author Tanmoy Mukherjee
 */
object PartiallyAppliedFunction {
  def myFunction(x:Int,y:Int,z:Int):Int = x+y+z

  def main(args: Array[String]): Unit = {

    val myfunc = myFunction(2,4,_:Int)
    println(myfunc(6))

  }

}
