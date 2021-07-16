package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class StringToIntConverterTest extends AnyFunSuite {

  private val converter = new StringToIntConverter()

  test("String to Int 1") {
    val res = converter.strToInt("5")
    assertResult(5)(res)
  }

  test("String to Int 2") {
    val res = converter.strToInt("-42")
    assertResult(-42)(res)
  }

  test("String to Int 3") {
    val res = converter.strToInt("4193")
    assertResult(4193)(res)
  }

  test("String to Int 4") {
    val res = converter.strToInt("0")
    assertResult(0)(res)
  }

  test("String to Int 5") {
    val res = converter.strToInt("-12")
    assertResult(-12)(res)
  }

  test("String to Int 6") {
    val res = converter.strToInt("987")
    assertResult(987)(res)
  }

  test("String to Int 7") {
    val res = converter.strToInt("21474836460")
    assertResult(Int.MaxValue)(res)
  }

  test("String to Int 8") {
    val res = converter.strToInt("-91283472332")
    assertResult(Int.MinValue)(res)
  }

  test("String to Int 9") {
    val res = converter.strToInt("-91283478943723287492332")
    assertResult(Int.MinValue)(res)
  }

}
