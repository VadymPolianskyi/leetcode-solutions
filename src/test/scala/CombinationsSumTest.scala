package com.polianskyi.leetcode

import AssertHelper.compareListsIfEquals

import org.scalatest.funsuite.AnyFunSuite

class CombinationsSumTest extends AnyFunSuite {

  private val cs = new CombinationSum()

  test("Combination sums 1") {
    val res = cs.combinationSum(Array(2, 3, 6, 7), 7)
    assert(compareListsIfEquals(List(List(2, 2, 3), List(7)), res))
  }

  test("Combination sums 2") {
    val res = cs.combinationSum(Array(2, 3, 5), 8)
    assert(compareListsIfEquals(List(List(2, 2, 2, 2), List(2, 3, 3), List(3, 5)), res))
  }

  test("Combination sums 3") {
    val res = cs.combinationSum(Array(2), 1)
    assert(compareListsIfEquals(List(), res))
  }

  test("Combination sums 4") {
    val res = cs.combinationSum(Array(1), 1)
    assert(compareListsIfEquals(List(List(1)), res))
  }

  test("Combination sums 5") {
    val res = cs.combinationSum(Array(1), 2)
    assert(compareListsIfEquals(List(List(1, 1)), res))
  }


}


