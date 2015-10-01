package easyChallenges1

object eulerNumbers {

  def f(x: Float): Float = {
    // Compute and Return the value of e^x 
    round(1 + x + (pow(x,2)/fact(2)) + (pow(x,3)/fact(3)) + (pow(x,4)/fact(4)) + (pow(x,5)/fact(5)) + (pow(x,6)/fact(6)) + (pow(x,7)/fact(7)) + (pow(x,8)/fact(8)) + (pow(x,9)/fact(9)))// + (pow(x,10)/fact(10)))
  }
  
  def pow(x: Float, y: Int): Float = {
    if (x != 0) {
      if (y == 0 || y == 1)
        x
      else {
        x * pow(x , y - 1)
        /*while (i > 0) {
          res = res * x
           i = i - 1
        }
        res*/
      }
    }
    else 
      x
  }
  
  def fact(x: Int): Int = {
    if (x == 1)
      x
    else {
      x * fact(x - 1)
      /*while (i > 1) {
         res = res * (i - 1)
         i = i - 1
      }
      res*/
    }
  }
  
  def round(x: Float): Float = {
    BigDecimal(x).setScale(4, BigDecimal.RoundingMode.HALF_UP).toFloat
  }

  def recursiveHWPrint(n: Int): Unit = {
    if (n > 0) {
      println("Hello World")
      recursiveHWPrint(n - 1)
    }
  }
}