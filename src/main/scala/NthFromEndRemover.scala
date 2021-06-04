package com.polianskyi.leetcode

import NthFromEndRemover.ListNode

class NthFromEndRemover {
  def removeNthFromEnd(head: ListNode, n: Int): ListNode = {
    goToEndAndBack(head, n)._1
  }

  def goToEndAndBack(head: ListNode, n: Int): (ListNode, Int) = {
    if (head.next != null) {
      val next = goToEndAndBack(head.next, n)
      val currentNFromEnd = next._2 + 1
      val node =
        if (currentNFromEnd == n) next._1
        else ListNode(head.x, next._1)
      (node, currentNFromEnd)
    } else {
      if (n == 1) (null, 1)
      else (head, 1)
    }
  }
}

object NthFromEndRemover {

  case class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

}
