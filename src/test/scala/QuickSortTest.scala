package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class QuickSortTest extends AnyFunSuite {

  private val qs = new QuickSort()

  test("QuickSort 1") {
    val res = qs.quickSort(Array(2, 0, 2, 1, 1, 0))
    assertResult(Array(0, 0, 1, 1, 2, 2))(res)
  }

  test("QuickSort 2") {
    val res = qs.quickSort(Array(2, 0, 1))
    assertResult(Array(0, 1, 2))(res)
  }

  test("QuickSort 3") {
    val res = qs.quickSort(Array(0))
    assertResult(Array(0))(res)
  }

  test("QuickSort 4") {
    val res = qs.quickSort(Array(1))
    assertResult(Array(1))(res)
  }

}


