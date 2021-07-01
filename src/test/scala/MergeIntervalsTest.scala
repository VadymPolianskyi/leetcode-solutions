package com.polianskyi.leetcode

import AssertHelper.{compareArraysIfEquals, compareListsIfEquals}

import org.scalatest.funsuite.AnyFunSuite

class MergeIntervalsTest extends AnyFunSuite {

  private val mi = new MergeIntervals()

  test("Merge intervals 1") {
    val res = mi.merge(Array(Array(1,3),Array(2,6),Array(8,10),Array(15,18)))
    assert(compareArraysIfEquals(Array(Array(1,6),Array(8,10),Array(15,18)), res))
  }

  test("Merge intervals 2") {
    val res = mi.merge(Array(Array(1,4),Array(4,5)))
    assert(compareArraysIfEquals(Array(Array(1,5)), res))
  }

  test("Merge intervals 3") {
    val res = mi.merge(Array(Array(1,4),Array(0,4)))
    assert(compareArraysIfEquals(Array(Array(0,4)), res))
  }

  test("Merge intervals 4") {
    val res = mi.merge(Array(Array(1,3),Array(2,6),Array(8,10),Array(15,18), Array(29, 49), Array(16, 50), Array(0, 60)))
    assert(compareArraysIfEquals(Array(Array(0,60)), res))
  }

  test("Merge intervals 5") {
    val res = mi.merge(Array(Array(1,4),Array(0,1)))
    assert(compareArraysIfEquals(Array(Array(0,4)), res))
  }

  test("Merge intervals 6") {
    val res = mi.merge(Array(Array(1,4),Array(0,0)))
    assert(compareArraysIfEquals(Array(Array(0,0), Array(1, 4)), res))
  }

}


