package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class PhoneNumberLetterCombinationsTest  extends AnyFunSuite  {

  private val combinator = new PhoneNumberLetterCombinations()

  test("Find single digit combinations") {
    val res = combinator.letterCombinations("2")
    assertResult(List("a","b","c"))(res)
  }

  test("Find double digit combinations") {
    val res = combinator.letterCombinations("22")
    assertResult(List("aa", "ab", "ac", "ba","bb","bc","ca", "cb", "cc"))(res)
  }

  test("Find simple combinations") {
    val res = combinator.letterCombinations("23")
    assertResult(List("ad","ae","af","bd","be","bf","cd","ce","cf"))(res)
  }

  test("Find empty") {
    val res = combinator.letterCombinations("")
    assertResult(List())(res)
  }

}
