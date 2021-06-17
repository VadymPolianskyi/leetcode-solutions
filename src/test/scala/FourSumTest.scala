package com.polianskyi.leetcode

import ThreeSumTest.compareListsIfEquals

import org.scalatest.funsuite.AnyFunSuite

class FourSumTest extends AnyFunSuite {

  private val processor = new FourSum()

  test("Four sums 1") {
    val res = processor.fourSum(Array(1,0,-1,0,-2,2), 0)
    assert(compareListsIfEquals(List(List(-2,-1,1,2), List(-2,0,0,2), List(-1,0,0,1)), res))
  }

  test("Four sums 2") {
    val res = processor.fourSum(Array(2,2,2,2,2), 8)
    assert(compareListsIfEquals(List(List(2,2,2,2)), res))
  }

  test("Four sums 3") {
    val res = processor.fourSum(Array(-3,-1,0,2,4,5), 1)
    assert(compareListsIfEquals(List(List(-3,-1,0,5)), res))
  }

}


