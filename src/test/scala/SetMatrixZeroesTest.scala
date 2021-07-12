package com.polianskyi.leetcode

import AssertHelper.compareArraysIfEquals

import org.scalatest.funsuite.AnyFunSuite

class SetMatrixZeroesTest extends AnyFunSuite {

  private val smz = new SetMatrixZeroes()

  test("Set Matrix Zeroes 1") {
    val arr = Array(Array(1, 1, 1), Array(1, 0, 1), Array(1, 1, 1))
    smz.setZeroes(arr)
    compareArraysIfEquals(Array(Array(1, 0, 1), Array(0, 0, 0), Array(1, 0, 1)), arr)


  }

  test("Set Matrix Zeroes 2") {
    val arr = Array(Array(0,1,2,0),Array(3,4,5,2),Array(1,3,1,5))
    smz.setZeroes(arr)
    compareArraysIfEquals(Array(Array(0,0,0,0),Array(0,4,5,0),Array(0,3,1,0)), arr)
  }

  test("Set Matrix Zeroes 3") {
    val arr = Array(Array(1),Array(0))
    smz.setZeroes(arr)
    compareArraysIfEquals(Array(Array(0), Array(0)), arr)
  }
}


