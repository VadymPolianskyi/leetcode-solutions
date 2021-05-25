package com.polianskyi.leetcode

import FileArrayReader.readArray

import org.scalatest.funsuite.AnyFunSuite

class WaterContainerTest extends AnyFunSuite {

  private val container = new WaterContainer()

  test("Find the smallest container") {
    val res = container.maxArea(Array(1, 1))
    assertResult(1)(res)
  }

  test("Find container 1") {
    val res = container.maxArea(Array(4, 3, 2, 1, 4))
    assertResult(16)(res)
  }

  test("Find container 2") {
    val res = container.maxArea(Array(1, 8, 6, 2, 5, 4, 8, 3, 7))
    assertResult(49)(res)
  }

  test("Find container 3") {
    val res = container.maxArea(Array(1, 2, 1))
    assertResult(2)(res)
  }

  test("Find container 4") {
    val res = container.maxArea(Array(2, 1))
    assertResult(1)(res)
  }

  test("Find nothing 1") {
    val res = container.maxArea(Array(1, 0))
    assertResult(0)(res)
  }

  test("Find nothing 2") {
    val res = container.maxArea(Array(10))
    assertResult(0)(res)
  }

  test("Find from long array 1") {
    val res = BenchmarkUtil.withBenchmarkCheck(() => container.maxArea(readArray(1, "water-container-array")))
    assertResult(48431514)(res)
  }

  test("Find from long array 2") {
    val res = BenchmarkUtil.withBenchmarkCheck(() => container.maxArea(readArray(2, "water-container-array")))
    assertResult(4913370)(res)
  }

  test("Find from long array 3") {
    val res = BenchmarkUtil.withBenchmarkCheck(() => container.maxArea(readArray(3, "water-container-array")))
    assertResult(50000000)(res)
  }

}
