package com.polianskyi.leetcode

import scala.math.Ordering.Implicits.seqOrdering

object AssertHelper {

  def compareListsIfEquals[V](a: List[List[V]], b: List[List[V]]): Boolean = {
    assert(a.length == b.length)
    a.zip(b).count(x => x._1 != x._2) == 0
  }

  def compareStrListsIfEquals(a: List[List[String]], b: List[List[String]]): Boolean = {
    assert(a.length == b.length)
    a.sorted.zip(b.sorted).count(x => x._1 != x._2) == 0
  }

  def compareArraysIfEquals(a: Array[Array[Int]], b: Array[Array[Int]]): Boolean = {
    assert(a.length == b.length)
    a.zip(b).count(x => !(x._1 sameElements x._2)) == 0
  }
}
