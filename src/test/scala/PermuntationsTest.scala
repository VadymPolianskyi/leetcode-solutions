package com.polianskyi.leetcode

import AssertHelper.compareIntListsIfEquals

import org.scalatest.funsuite.AnyFunSuite

class PermuntationsTest extends AnyFunSuite {

  private val permutator = new Permutations()

  test("Permute 1") {
    val res = permutator.permute(Array(1, 2, 3))
    compareIntListsIfEquals(List(List(1, 2, 3), List(1, 3, 2), List(2, 1, 3), List(2, 3, 1), List(3, 1, 2), List(3, 2, 1)), res)
  }

  test("Permute 2") {
    val res = permutator.permute(Array(1, 2, 3, 4))
    compareIntListsIfEquals(List(List(1, 2, 3, 4), List(1, 2, 4, 3), List(1, 3, 2, 4), List(1, 3, 4, 2), List(1, 4, 2, 3), List(1, 4, 3, 2), List(2, 1, 3, 4), List(2, 1, 4, 3), List(2, 3, 1, 4), List(2, 3, 4, 1), List(2, 4, 1, 3), List(2, 4, 3, 1), List(3, 1, 2, 4), List(3, 1, 4, 2), List(3, 2, 1, 4), List(3, 2, 4, 1), List(3, 4, 1, 2), List(3, 4, 2, 1), List(4, 1, 2, 3), List(4, 1, 3, 2), List(4, 2, 1, 3), List(4, 2, 3, 1), List(4, 3, 1, 2), List(4, 3, 2, 1)), res)
  }

  test("Permute 3") {
    val res = permutator.permute(Array(0, 1))
    compareIntListsIfEquals(List(List(0, 1), List(1, 0)), res)
  }

  test("Permute 4") {
    val res = permutator.permute(Array(1))
    compareIntListsIfEquals(List(List(1)), res)
  }

}


