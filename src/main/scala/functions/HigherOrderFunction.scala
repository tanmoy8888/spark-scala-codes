package functions

/**
 * @author Tanmoy Mukherjee
 */
object HigherOrderFunction {
  def add(x:Int,y:Int):Int = x + y
  def sub(x:Int,y:Int):Int = x - y
  def mul(x:Int,y:Int):Int = x * y
  def div(x:Int,y:Int):Int = x / y

  def caller(x:Int,y:Int ,f: (Int,Int) => Int):Int = f(x,y)

  def main(args: Array[String]): Unit = {
    println(s"add() : ${caller(4,2, add(_,_))}")
    println(s"sub() : ${caller(4,2, sub(_,_))}")
    println(s"mul() : ${caller(4,2, mul(_,_))}")
    println(s"div() : ${caller(4,2, div(_,_))}")
  }

}
