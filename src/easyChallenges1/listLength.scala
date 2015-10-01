package easyChallenges1

/**
 * Created by developer on 2015-09-17.
 */
object listLength {
  def f(arr: List[Int]): Int = {
    def listLengthHelper(arr: List[Int], len: Int): Int = {
      if (arr.isEmpty) len
      else listLengthHelper(arr.tail, len + 1)
    }
    listLengthHelper(arr, 0)
  }
}
