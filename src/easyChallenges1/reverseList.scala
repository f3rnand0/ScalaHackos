package easyChallenges1

object reverseList {
  def f(arr:List[Int]) : List[Int] = {
    var reversed = scala.collection.mutable.ListBuffer[Int]()
    for(a <- (arr.length - 1) to 0 by -1) {
      reversed += arr(a)
    }
    reversed.toList
  }
}
