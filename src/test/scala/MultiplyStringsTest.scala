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

  test("Multiply sums 3") {
    val res = multiplier.multiply("235", "103")
    assertResult("24205")(res)
  }

  test("Multiply sums 4") {
    val res = multiplier.multiply("9133", "0")
    assertResult("0")(res)
  }

  test("Multiply sums 5") {
    val res = multiplier.multiply("140", "721")
    assertResult("100940")(res)
  }

  test("Multiply sums 6") {
    val res = multiplier.multiply("123456789", "987654321")
    assertResult("121932631112635269")(res)
  }


}


