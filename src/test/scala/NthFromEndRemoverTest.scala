package com.polianskyi.leetcode

import NthFromEndRemover.ListNode

import org.scalatest.funsuite.AnyFunSuite

class NthFromEndRemoverTest extends AnyFunSuite {

  private val remover = new NthFromEndRemover()

  test("Remove from single list") {
    val res = remover.removeNthFromEnd(ListNode(1), 1)
    assertResult(null)(res)
  }

  test("Remove from list 1") {
    val res = remover.removeNthFromEnd(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5))))), 2)
    assertResult(ListNode(1, ListNode(2, ListNode(3, ListNode(5)))))(res)
  }

  test("Remove from small list") {
    val res = remover.removeNthFromEnd(ListNode(1, ListNode(2)), 1)
    assertResult(ListNode(1))(res)
  }
}
