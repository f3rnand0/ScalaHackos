package easyChallenges1

object filterPositionsList {
  def f(arr:List[Int]) : List[Int] = {
    var filtered = scala.collection.mutable.ListBuffer[Int]()
    for(a <- arr.indices) {
      if (a % 2 != 0)
        filtered += arr(a)
    }
    filtered.toList
  }
}
