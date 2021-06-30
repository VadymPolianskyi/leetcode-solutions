package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class SpiralMatrixTest extends AnyFunSuite {

  private val sm = new SpiralMatrix()

  test("Spiral matrix 1") {
    val res = sm.spiralOrder(Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9)))
    assertResult(List(1, 2, 3, 6, 9, 8, 7, 4, 5))(res)
  }

  test("Spiral matrix 2") {
    val res = sm.spiralOrder(Array(Array(1, 2, 3, 4), Array(5, 6, 7, 8), Array(9, 10, 11, 12)))
    assertResult(List(1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7))(res)
  }

}


