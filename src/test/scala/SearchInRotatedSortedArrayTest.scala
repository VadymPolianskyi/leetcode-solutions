package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class SearchInRotatedSortedArrayTest extends AnyFunSuite {

  private val np = new SearchInRotatedSortedArray()

  test("Search 1") {
    val res = np.search(Array(4, 5, 6, 7, 0, 1, 2), 0)
    assertResult(4)(res)
  }

  test("Search 2") {
    val res = np.search(Array(4, 5, 6, 7, 0, 1, 2), 3)
    assertResult(-1)(res)
  }

  test("Search 3") {
    val res = np.search(Array(1), 0)
    assertResult(-1)(res)
  }

  test("Search 4") {
    val res = np.search(Array(1, 3), 0)
    assertResult(-1)(res)
  }

  test("Search 5") {
    val res = np.search(Array(5, 6, 7, 0, 1, 2, 3), 2)
    assertResult(5)(res)
  }

  test("Search 6") {
    val res = np.search(Array(50, 6, 7, 0, 1, 2), 2)
    assertResult(5)(res)
  }

}
