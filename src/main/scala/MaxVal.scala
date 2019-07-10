import scala.io.StdIn._
class MaxVal {

  def maxi(arr: Array[Int]): Unit = {
    println("hello")
    var m = arr(0)
    for (i <- 1 to arr.length) {
      if (m < arr(i)) {
        m = arr(i)
      }
    }

    m
  }
}

object Main extends App {
  def main(args: Array[Int]): Unit = {
    println("enert the first element")
    val arr = Array(5, 1, 3, 2, 4)
    //for (i <- 0 to arr.length) {
    val m = new MaxVal
    m.maxi(arr);

    println(m)

  }
}

