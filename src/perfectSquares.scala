import scala.io.StdIn._

object perfectSquares extends App {

val numCustomers : Int = readInt()
  
  val lineOfAmounts : String = readLine()
  
  val amounts : Array[Int] = lineOfAmounts.split(" ").map(x => x.toInt)
  
  var count = 0
  
  for (i <- amounts)
  {
  val squrroot : Double = Math.sqrt(i)
  
  if (squrroot.ceil - squrroot == 0)
  {
  
  count = count + 1
  
  }
  }
   println (count)
 
}