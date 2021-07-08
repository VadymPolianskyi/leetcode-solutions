package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class UniquePathsTest extends AnyFunSuite {

  private val up = new UniquePaths()

  test("Unique paths 1") {
    val res = up.uniquePaths(3, 7)
    assertResult(28)(res)
  }

  test("Unique paths 2") {
    val res = up.uniquePaths(3, 2)
    assertResult(3)(res)
  }

  test("Unique paths 3") {
    val res = up.uniquePaths(7, 3)
    assertResult(28)(res)
  }

  test("Unique paths 4") {
    val res = up.uniquePaths(3, 3)
    assertResult(6)(res)
  }

  test("Unique paths 5") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = up.uniquePaths(51, 9)
      assertResult(1916797311)(res)
    }
  }
}


