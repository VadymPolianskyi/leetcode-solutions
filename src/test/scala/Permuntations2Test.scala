package com.polianskyi.leetcode

import AssertHelper.compareIntListsIfEquals

import org.scalatest.funsuite.AnyFunSuite

class Permuntations2Test extends AnyFunSuite {

  private val permutator = new Permutations2()

  test("Permute2 1") {
    val res = permutator.permute(Array(1, 2, 3))
    compareIntListsIfEquals(List(List(1, 2, 3), List(1, 3, 2), List(2, 1, 3), List(2, 3, 1), List(3, 1, 2), List(3, 2, 1)), res)
  }

  test("Permute2 2") {
    val res = permutator.permute(Array(1, 2, 3, 4))
    compareIntListsIfEquals(List(List(1, 2, 3, 4), List(1, 2, 4, 3), List(1, 3, 2, 4), List(1, 3, 4, 2), List(1, 4, 2, 3), List(1, 4, 3, 2), List(2, 1, 3, 4), List(2, 1, 4, 3), List(2, 3, 1, 4), List(2, 3, 4, 1), List(2, 4, 1, 3), List(2, 4, 3, 1), List(3, 1, 2, 4), List(3, 1, 4, 2), List(3, 2, 1, 4), List(3, 2, 4, 1), List(3, 4, 1, 2), List(3, 4, 2, 1), List(4, 1, 2, 3), List(4, 1, 3, 2), List(4, 2, 1, 3), List(4, 2, 3, 1), List(4, 3, 1, 2), List(4, 3, 2, 1)), res)
  }

  test("Permute2 3") {
    val res = permutator.permute(Array(0, 1))
    compareIntListsIfEquals(List(List(0, 1), List(1, 0)), res)
  }

  test("Permute2 4") {
    val res = permutator.permute(Array(1))
    compareIntListsIfEquals(List(List(1)), res)
  }

  test("Permute2 5") {
    val res = permutator.permute(Array(1, 1, 2))
    compareIntListsIfEquals(List(List(1,1,2), List(1,2,1), List(2,1,1)), res)
  }

}


