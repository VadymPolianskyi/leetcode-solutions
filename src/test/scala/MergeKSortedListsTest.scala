package com.polianskyi.leetcode

import MergeKSortedLists.ListNode

import org.scalatest.funsuite.AnyFunSuite

class MergeKSortedListsTest extends AnyFunSuite {

  private val merger = new MergeKSortedLists()

  test("Merge single list") {
    val res = merger.mergeKLists(Array(ListNode(1)))
    assertResult(ListNode(1))(res)
  }

  test("Merge list 1") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = merger.mergeKLists(Array(
        ListNode(1, ListNode(4, ListNode(5))),
        ListNode(1, ListNode(3, ListNode(4))),
        ListNode(2, ListNode(6))
      ))
      assertResult(ListNode(1, ListNode(1, ListNode(2, ListNode(3, ListNode(4, ListNode(4, ListNode(5, ListNode(6, null)))))))))(res)
    }
  }

  test("Merge empty list") {
    val res = merger.mergeKLists(Array(ListNode()))
    assertResult(ListNode())(res)
  }
}
