package com.polianskyi.leetcode

import SortList.ListNode

import org.scalatest.funsuite.AnyFunSuite

class SortListTest extends AnyFunSuite {

  private val sl = new SortList()

  test("Sort List 1") {
    val res = sl.sortList(ListNode(4, ListNode(2, ListNode(1, ListNode(3, ListNode(5))))))
    assertResult(ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(5))))))(res)
  }

  test("Sort List 2") {
    val res = sl.sortList(ListNode(2, ListNode(1, ListNode(0))))
    assertResult(ListNode(0, ListNode(1, ListNode(2))))(res)
  }

  test("Sort List 3") {
    val res = sl.sortList(ListNode(1))
    assertResult(ListNode(1))(res)
  }
}


