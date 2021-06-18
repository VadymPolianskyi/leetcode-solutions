package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class FindFirstAndLastPositionOfElementInSortedArrayTest extends AnyFunSuite {

  private val finder = new FindFirstAndLastPositionOfElementInSortedArray()

  test("Find 1") {
    val res = finder.searchRange(Array(5, 7, 7, 8, 8, 10), 8)
    assertResult(Array(3, 4))(res)
  }

  test("Find 2") {
    val res = finder.searchRange(Array(5, 7, 7, 8, 8, 10), 6)
    assertResult(Array(-1, -1))(res)
  }

  test("Find 3") {
    val res = finder.searchRange(Array(), 0)
    assertResult(Array(-1, -1))(res)
  }

  test("Find 4") {
    val res = finder.searchRange(Array(1), 1)
    assertResult(Array(0, 0))(res)
  }

}
