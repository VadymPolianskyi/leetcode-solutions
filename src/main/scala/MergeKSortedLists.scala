package com.polianskyi.leetcode

import MergeKSortedLists.ListNode

class MergeKSortedLists {
  def mergeKLists(lists: Array[ListNode]): ListNode = {
    merge(lists.filter(_ != null))
  }

  def merge(lists: Array[ListNode]): ListNode = {
    if (lists.isEmpty) return null
    var a = 0
    val m = lists.map { ln =>
      val ret = (ln, a)
      a = a + 1
      ret
    }.minBy(_._1.x)

    lists.update(m._2, m._1.next)

    ListNode(m._1.x, merge(lists.filter(_ != null)))
  }
}

object MergeKSortedLists {

  case class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

}