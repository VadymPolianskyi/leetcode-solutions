package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class SubsetsTest extends AnyFunSuite {

  private val subset = new Subsets()

  test("Subset 1") {
    val res = subset.subsets(Array(1, 2, 3))
    AssertHelper.compareIntListsIfEquals(
      List(List(), List(1), List(2), List(1, 2), List(3), List(1, 3), List(2, 3), List(1, 2, 3)), res)
  }

  test("Subset 2") {
    val res = subset.subsets(Array(0))
    AssertHelper.compareIntListsIfEquals(
      List(List(), List(0)), res)
  }
}


