package easyChallenges1

object listReplication {

	def f(num:Int,arr:List[Int]):List[Int] = {
    var replicated = scala.collection.mutable.ListBuffer[Int]()
    for(a <- arr.indices) {
      for (b <- 1 to num) {
        //println(arr(a))
        replicated += arr(a)
      }
    }
    replicated.toList
	}
}