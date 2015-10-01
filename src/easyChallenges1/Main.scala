package easyChallenges1

object Main extends App {
  /*
  var list = listReplication.f(2,List(2,1,3))
  list.foreach(println)
  */

  /*
  var list = filterArray.f(3,List(2,1,3))
  list.foreach(println)
  */

  /*
  var list = filterPositionsList.f(List(2,1,3))
  list.foreach(println)
  */

  /*
  var list = arrayNElements.f(3)
  list.foreach(println)
  */

  /*
  var list = reverseList.f(List(1,2,3))
  list.foreach(println)
  */

  /*
  var sum = sumOddElements.f(List(3,2,4,6,5,7,8,0,1))
  println(sum)
    sum = sumOddElements.f(List(11,25,18,-1,26,-20,-19,23,-24,-8))
  println(sum)
  */

  //println(listLength.f(List()))

  //println(updateList.f(List(1,-3)))

  // Right answer Area: 414.0
  // Right answer Area: 36024.1
  println(areaVolumeURCurve.summation(areaVolumeURCurve.f, 20, 2, List(1,2), List(0,1)))
  //println(areaVolumeURCurve.summation(areaVolumeURCurve.area, 20, 2, List(1,2), List(0,1)))
}
