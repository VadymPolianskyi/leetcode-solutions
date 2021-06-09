package com.polianskyi.leetcode

import SwapNodesInPairs.ListNode


class SwapNodesInPairs {

  def swapPairs(head: ListNode): ListNode = {
    if (head == null || head.next == null) head
    else {
      val nxt = head.next
      val nextNxt = nxt.next
      val head1 =
        if (nextNxt != null) ListNode(head.x, swapPairs(nextNxt))
        else ListNode(head.x, null)

      ListNode(nxt.x, head1)
    }
  }
}

object SwapNodesInPairs {

  case class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

}
