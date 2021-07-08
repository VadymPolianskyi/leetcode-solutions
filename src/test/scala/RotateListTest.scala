package com.polianskyi.leetcode

import RotateList.ListNode

import org.scalatest.funsuite.AnyFunSuite

class RotateListTest extends AnyFunSuite {

  private val rl = new RotateList()

  test("Rotate List 1") {
    val res = rl.rotateRight(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5))))), 2)
    assertResult(ListNode(4, ListNode(5, ListNode(1, ListNode(2, ListNode(3))))))(res)
  }

  test("Rotate List 2") {
    val res = rl.rotateRight(ListNode(0, ListNode(1, ListNode(2))), 4)
    assertResult(ListNode(2, ListNode(0, ListNode(1))))(res)
  }

  test("Rotate List 3") {
    val res = rl.rotateRight(ListNode(1), 200001)
    assertResult(ListNode(1))(res)
  }
}


