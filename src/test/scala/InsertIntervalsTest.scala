package com.polianskyi.leetcode

import AssertHelper.compareArraysIfEquals

import org.scalatest.funsuite.AnyFunSuite

class InsertIntervalsTest extends AnyFunSuite {

  private val ii = new InsertInterval()

  test("Insert intervals 1") {
    val res = ii.insert(Array(Array(1, 3), Array(6, 9)), Array(2, 5))
    assert(compareArraysIfEquals(Array(Array(1, 5), Array(6, 9)), res))
  }

  test("Insert intervals 2") {
    val res = ii.insert(Array(Array(1, 2), Array(3, 5), Array(6, 7), Array(8, 10), Array(12, 16)), Array(4, 8))
    assert(compareArraysIfEquals(Array(Array(1, 2), Array(3, 10), Array(12, 16)), res))
  }

  test("Insert intervals 3") {
    val res = ii.insert(Array(), Array(5, 7))
    assert(compareArraysIfEquals(Array(Array(5, 7)), res))
  }

  test("Insert intervals 4") {
    val res = ii.insert(Array(Array(1, 5)), Array(2, 3))
    assert(compareArraysIfEquals(Array(Array(1, 5)), res))
  }

  test("Insert intervals 5") {
    val res = ii.insert(Array(Array(1, 5)), Array(2, 7))
    assert(compareArraysIfEquals(Array(Array(1, 7)), res))
  }
}


