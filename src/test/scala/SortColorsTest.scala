package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class SortColorsTest extends AnyFunSuite {

  private val sc = new SortColors()

  test("Sort colors 1") {
    val inp = Array(2, 0, 2, 1, 1, 0)
    sc.sortColors(inp)
    assertResult(Array(0, 0, 1, 1, 2, 2))(inp)
  }

  test("Sort colors 2") {
    val inp = Array(2, 0, 1)
    sc.sortColors(inp)
    assertResult(Array(0, 1, 2))(inp)
  }

  test("Sort colors 3") {
    val inp = Array(0)
    sc.sortColors(inp)
    assertResult(Array(0))(inp)
  }

  test("Sort colors 4") {
    val inp = Array(1)
    sc.sortColors(inp)
    assertResult(Array(1))(inp)
  }

}


