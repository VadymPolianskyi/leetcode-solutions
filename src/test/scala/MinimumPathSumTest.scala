package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class MinimumPathSumTest extends AnyFunSuite {

  private val cs = new MinimumPathSum()

  test("Minimum Path Sum 1") {
    val res = cs.minPathSum(Array(Array(1,3,1),Array(1,5,1),Array(4,2,1)))
    assertResult(7)(res)
  }

  test("Minimum Path Sum 2") {
    val res = cs.minPathSum(Array(Array(1,2,3),Array(4,5,6)))
    assertResult(12)(res)
  }
}


