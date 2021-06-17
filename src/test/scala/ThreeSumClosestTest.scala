package com.polianskyi.leetcode


import org.scalatest.funsuite.AnyFunSuite

class ThreeSumClosestTest extends AnyFunSuite {

  private val processor = new ThreeSumClosest()

  test("Find sum 1") {
    val res = processor.threeSumClosest(Array(-1, 2, 1, -4), 1)
    assertResult(2)(res)
  }

  test("Find sum 2") {
    val res = processor.threeSumClosest(Array(3, 5, 7, 2, 7, -1, 24, -4), 10)
    assertResult(10)(res)
  }

  test("Find sum 3") {
    val res = processor.threeSumClosest(Array(3, 5, 7, 2, -7, -1, 24, -4), -10)
    assertResult(-9)(res)
  }

  test("Find sum 4") {
    val res = processor.threeSumClosest(Array(1, 1, -1, -1, 3), -1)
    assertResult(-1)(res)
  }

  test("Find sum 5") {
    val res = processor.threeSumClosest(Array(1, 1, -1, -1, 3), 3)
    assertResult(3)(res)
  }

  test("Find sum 6") {
    val res = processor.threeSumClosest(Array(-3, -2, -5, 3, -4), -1)
    assertResult(-2)(res)
  }

  test("Find sum 7") {
    val res = processor.threeSumClosest(Array(1, 2, 4, 8, 16, 32, 64, 128), 82)
    assertResult(82)(res)
  }
}


