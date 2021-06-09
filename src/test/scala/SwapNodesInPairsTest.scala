package com.polianskyi.leetcode

import SwapNodesInPairs.ListNode

import org.scalatest.funsuite.AnyFunSuite

class SwapNodesInPairsTest extends AnyFunSuite {

  private val swapper = new SwapNodesInPairs()

  test("Swap in single list") {
    val res = swapper.swapPairs(ListNode(1))
    assertResult(ListNode(1))(res)
  }

  test("Swap in list 1") {
    val res = swapper.swapPairs(ListNode(1, ListNode(2, ListNode(3, ListNode(4)))))
    assertResult(ListNode(2, ListNode(1, ListNode(4, ListNode(3)))))(res)
  }

  test("Remove from empty list") {
    val res = swapper.swapPairs(ListNode())
    assertResult(ListNode())(res)
  }
}
