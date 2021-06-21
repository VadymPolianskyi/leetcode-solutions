package com.polianskyi.leetcode

import AssertHelper.compareListsIfEquals
import org.scalatest.funsuite.AnyFunSuite

class ThreeSumTest extends AnyFunSuite {

  private val processor = new ThreeSum()

  test("Simple 3 sums") {
    val res = processor.threeSum(Array(-1, 0, 1, 2, -1, -4))
    assert(compareListsIfEquals(List(List(-1, -1, 2), List(-1, 0, 1)), res))
  }

  test("Empty 3 sum") {
    val res = processor.threeSum(Array())
    assertResult(List())(res)
  }

  test("Empty 3 sum 2") {
    val res = processor.threeSum(Array(0))
    assertResult(List())(res)
  }

  test("3 sums from long array") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = processor.threeSum(FileArrayReader.readArray(1, "three-sum-array"))
      assertResult(16258)(res.length)
    }
  }

  test("3 sums from long zero array") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = processor.threeSum(FileArrayReader.readArray(2, "three-sum-array"))
      assert(compareListsIfEquals(List(List(0, 0, 0)), res))
    }
  }
}
