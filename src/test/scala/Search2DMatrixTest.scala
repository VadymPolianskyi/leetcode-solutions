package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class Search2DMatrixTest extends AnyFunSuite {

  private val searcher = new Search2DMatrix()

  test("Search a 2D Matrix 1") {
    val res = searcher.searchMatrix(Array(Array(1, 3, 5, 7), Array(10, 11, 16, 20), Array(23, 30, 34, 60)), 3)
    assertResult(true)(res)
  }

  test("Search a 2D Matrix 2") {
    val res = searcher.searchMatrix(Array(Array(1,3,5,7),Array(10,11,16,20),Array(23,30,34,60)), 13)
    assertResult(false)(res)
  }

  test("Search a 2D Matrix 3") {
    val res = searcher.searchMatrix(Array(Array(1)), 1)
    assertResult(true)(res)
  }

}


