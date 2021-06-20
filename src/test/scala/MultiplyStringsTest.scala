package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class MultiplyStringsTest extends AnyFunSuite {

  private val multiplier = new MultiplyStrings()

  test("Multiply sums 1") {
    val res = multiplier.multiply("2", "3")
    assertResult("6")(res)
  }

  test("Multiply sums 2") {
    val res = multiplier.multiply("123", "456")
    assertResult("56088")(res)
  }


}


