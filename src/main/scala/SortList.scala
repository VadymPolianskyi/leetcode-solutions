package com.polianskyi.leetcode

import SortList._

import scala.annotation.tailrec


class SortList {
  def sortList(head: ListNode): ListNode = {
    if (head == null) head
    else rebuild(sort(head))
  }

  def sort(head: ListNode): ListNode = {
    if (head.next == null) head
    else {
      val mid = middle(head, head.next)
      merge(sortList(head), sortList(mid))
    }
  }

  @tailrec
  private def middle(slow: ListNode, fast: ListNode): ListNode =
    if (fast != null && fast.next != null) {
      middle(slow.next, fast.next.next)
    } else {
      val mid = slow.next
      slow.next = null
      mid
    }

  private def merge(right: ListNode, left: ListNode): ListNode = {
    if (right != null && left != null) {
      if (right.x < left.x) new ListNode(right.x, merge(right.next, left))
      else new ListNode(left.x, merge(right, left.next))
    } else Option(right).getOrElse(left)

  }

  private def rebuild(head: ListNode): ListNode =
    if (head.next != null) ListNode(head.x, rebuild(head.next))
    else ListNode(head.x)
}

object SortList {

  case class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

}
