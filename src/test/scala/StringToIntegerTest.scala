package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class StringToIntegerTest extends AnyFunSuite {

  private val converter = new StringToInteger()

  test("Convert single digit") {
    val res = converter.myAtoi("5")
    assertResult(5)(res)
  }

  test("Convert negative int") {
    val res = converter.myAtoi("   -42")
    assertResult(-42)(res)
  }

  test("Convert int with words") {
    val res = converter.myAtoi("4193 with words")
    assertResult(4193)(res)
  }

  test("Find error with single + symbol") {
    val res = converter.myAtoi("+")
    assertResult(0)(res)
  }

  test("Find error with +- symbols") {
    val res = converter.myAtoi("-+12")
    assertResult(0)(res)
  }

  test("Find error with wrong first symbols") {
    val res = converter.myAtoi("words and 987")
    assertResult(0)(res)
  }

  test("Convert overweight positive int") {
    val res = converter.myAtoi("21474836460")
    assertResult(Int.MaxValue)(res)
  }

  test("Convert overweight negative int") {
    val res = converter.myAtoi("-91283472332")
    assertResult(Int.MinValue)(res)
  }

}
