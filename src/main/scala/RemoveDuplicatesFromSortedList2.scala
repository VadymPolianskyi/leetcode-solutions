package com.polianskyi.leetcode

import RemoveDuplicatesFromSortedList2.ListNode

class RemoveDuplicatesFromSortedList2 {
  def deleteDuplicates(head: ListNode): ListNode = {
    if (head == null) null
    else deduplicated(head.next, head.x)
  }

  def deduplicated(head: ListNode, current: Int, count: Int = 1): ListNode = {
    if (head == null)
      if (count == 1) ListNode(current, null)
      else null
    else if (head.x != current) {
      if (count == 1) ListNode(current, deduplicated(head.next, head.x))
      else deduplicated(head.next, head.x)
    }
    else deduplicated(head.next, head.x, count + 1)
  }


}

object RemoveDuplicatesFromSortedList2 {
  case class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }
}
