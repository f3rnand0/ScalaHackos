package easyChallenges1

/**
 * Created by developer on 2015-09-08.
 */
object sumOddElements {
  def f(arr:List[Int]):Int = {
    arr.filter(x => (x % 2 == 1) || (x % 2 == -1)).sum
  }
}
