package com.polianskyi.leetcode

import SwapNodesInPairs.ListNode

import org.scalatest.funsuite.AnyFunSuite

class SwapNodesInPairsTest  extends AnyFunSuite  {

  private val swapper = new SwapNodesInPairs()

  test("Swap in single list") {
    val res = swapper.swapPairs(new ListNode(1))
    assertResult(new ListNode(1))(res)
  }

  test("Swap in list 1") {
    val res = swapper.swapPairs(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4)))))
    assertResult(new ListNode(2, new ListNode(1, new ListNode(4, new ListNode(3)))))(res)
  }

  test("Remove from empty list") {
    val res = swapper.swapPairs(new ListNode())
    assertResult(new ListNode())(res)
  }
}
