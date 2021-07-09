package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class UniquePaths2Test extends AnyFunSuite {

  private val up = new UniquePaths2()

  test("Unique paths 1") {
    val res = up.uniquePathsWithObstacles(Array(Array(0,0,0),Array(0,1,0),Array(0,0,0)))
    assertResult(2)(res)
  }

  test("Unique paths 2") {
    val res = up.uniquePathsWithObstacles(Array(Array(0,1),Array(0,0)))
    assertResult(1)(res)
  }

  test("Unique paths 3") {
    val res = up.uniquePathsWithObstacles(Array(Array(1,0)))
    assertResult(0)(res)
  }

  test("Unique paths 4") {
    val res = up.uniquePathsWithObstacles(Array(Array(0,1)))
    assertResult(0)(res)
  }

  test("Unique paths 5") {
    val res = up.uniquePathsWithObstacles(Array(Array(0)))
    assertResult(1)(res)
  }

  test("Unique paths 6") {
    val res = up.uniquePathsWithObstacles(Array(Array(0,1,0,0,0),Array(1,0,0,0,0),Array(0,0,0,0,0),Array(0,0,0,0,0)))
    assertResult(0)(res)
  }

}


