package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class SearchInRotatedSortedArray2Test extends AnyFunSuite {

  private val np = new SearchInRotatedSortedArray2()

  test("Search 1") {
    val res = np.search(Array(4, 5, 6, 7, 0, 1, 2), 0)
    assertResult(true)(res)
  }

  test("Search 2") {
    val res = np.search(Array(2,5,6,0,0,1,2), 3)
    assertResult(false)(res)
  }

  test("Search 3") {
    val res = np.search(Array(4,5,6,6,7,0,1,2,4,4), 3)
    assertResult(false)(res)
  }

  test("Search 4") {
    val res = np.search(Array(4,5,6,6,7,0,1,2,4,4), 1)
    assertResult(true)(res)
  }

  test("Search 5") {
    val res = np.search(Array(4,5,6,6,7,0,1,2,4,4), 6)
    assertResult(true)(res)
  }

  test("Search 6") {
    val res = np.search(Array(4,5,6,6,7,0,1,2,4,4), 140)
    assertResult(false)(res)
  }

  test("Search 7") {
    val res = np.search(Array(1,0,1,1,1), 0)
    assertResult(true)(res)
  }

  test("Search 8") {
    val res = np.search(Array(2,5,6,0,0,1,2), 0)
    assertResult(true)(res)
  }

  test("Search 9") {
    val res = np.search(Array(0,1,2,2,2,3), 2)
    assertResult(true)(res)
  }

  test("Search 10") {
    val res = np.search(Array(1,2,3,0,1,1), 3)
    assertResult(true)(res)
  }
}
