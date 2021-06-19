package com.polianskyi.leetcode

import ThreeSumTest.compareListsIfEquals

import org.scalatest.funsuite.AnyFunSuite

class CountAndSayTest extends AnyFunSuite {

  private val counter = new CountAndSay()

  test("Count and say 4") {
    val res = counter.countAndSay(4)
    assertResult("1211")(res)
  }

  test("Count and say 1") {
    val res = counter.countAndSay(1)
    assertResult("1")(res)
  }

  test("Count and say 5") {
    val res = counter.countAndSay(5)
    assertResult("111221")(res)
  }

  test("Count and say 6") {
    val res = counter.countAndSay(6)
    assertResult("312211")(res)
  }
}


