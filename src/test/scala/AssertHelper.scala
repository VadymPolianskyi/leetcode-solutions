package com.polianskyi.leetcode

object AssertHelper {

  def compareListsIfEquals(a: List[List[Int]], b: List[List[Int]]): Boolean = {
    assert(a.length == b.length)
    a.zip(b).count(x => x._1 != x._2) == 0
  }

  def compareArraysIfEquals(a: Array[Array[Int]], b: Array[Array[Int]]): Boolean = {
    assert(a.length == b.length)
    a.zip(b).count(x => !(x._1 sameElements x._2)) == 0
  }
}
