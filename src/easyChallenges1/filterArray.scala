package easyChallenges1

object filterArray {
  def f(delim:Int,arr:List[Int]):List[Int] = {
    arr.filter(_ < delim)
  }
}
