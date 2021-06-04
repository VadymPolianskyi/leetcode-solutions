package com.polianskyi.leetcode

import com.polianskyi.leetcode.NthFromEndRemover.ListNode
import org.scalatest.funsuite.AnyFunSuite

class NthFromEndRemoverTest  extends AnyFunSuite  {

  private val remover = new NthFromEndRemover()

  test("Remove from single list") {
    val res = remover.removeNthFromEnd(new ListNode(1), 1)
    assertResult(null)(res)
  }

  test("Remove from list 1") {
    val res = remover.removeNthFromEnd(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5))))), 2)
    assertResult(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(5)))))(res)
  }

  test("Remove from small list") {
    val res = remover.removeNthFromEnd(new ListNode(1, new ListNode(2)), 1)
    assertResult(new ListNode(1))(res)
  }
}
