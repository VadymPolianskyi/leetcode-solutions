package com.polianskyi.leetcode

import RotateList._

import scala.annotation.tailrec

class RotateList {
  def rotateRight(head: ListNode, k: Int): ListNode = {
    if (head == null) null
    else {
      val l = length(head)
      val newK = if (k >= l) k % l else k
      rebuild(rotate(head, newK))
    }
  }

  private def rebuild(head: ListNode): ListNode =
    if (head.next != null) ListNode(head.x, rebuild(head.next))
    else ListNode(head.x)

  @tailrec
  private final def rotate(head: ListNode, k: Int): ListNode =
    if (k <= 0) head
    else rotate(ListNode(getLast(head).x, head), k - 1)

  @tailrec
  private final def getLast(head: ListNode): ListNode = {
    if (head.next != null) {
      if (head.next.next != null) getLast(head.next)
      else {
        val last = head.next
        head.next = null
        last
      }
    }
    else head
  }

  @tailrec
  private final def length(head: ListNode, acc: Int = 0): Int = {
    if (head.next != null) length(head.next, acc + 1)
    else acc + 1
  }
}

object RotateList {

  case class ListNode(_x: Int = 0, _next: ListNode = null) {
    var next: ListNode = _next
    var x: Int = _x
  }

}