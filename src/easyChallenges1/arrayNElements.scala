package easyChallenges1

object arrayNElements {

  def f(num:Int) : List[Int] = {
    var array = scala.collection.mutable.ListBuffer[Int]()
    val r = scala.util.Random
    for(a <- 1 to num) {
      array += r.nextInt(100)
    }
    array.toList
  }
}
