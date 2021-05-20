package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class IntegerToRomanTest  extends AnyFunSuite  {

  private val converter = new IntegerToRoman()

  test("Convert single int 1") {
    val res = converter.intToRoman(1)
    assertResult("I")(res)
  }

  test("Convert single int 3") {
    val res = converter.intToRoman(3)
    assertResult("III")(res)
  }

  test("Convert single int 4") {
    val res = converter.intToRoman(4)
    assertResult("IV")(res)
  }

  test("Convert single int 9") {
    val res = converter.intToRoman(9)
    assertResult("IX")(res)
  }

  test("Convert int 58") {
    val res = converter.intToRoman(58)

    //Explanation: L = 50, V = 5, III = 3
    assertResult("LVIII")(res)
  }

  test("Convert int 1994") {
    val res = converter.intToRoman(1994)

    //Explanation: M = 1000, CM = 900, XC = 90 and IV = 4
    assertResult("MCMXCIV")(res)
  }
}
