package com.polianskyi.leetcode

import RemoveDuplicatesFromSortedList2.ListNode
import org.scalatest.funsuite.AnyFunSuite

class RemoveDuplicatesFromSortedList2Test extends AnyFunSuite {

  private val processor = new RemoveDuplicatesFromSortedList2()

  test("Remove duplicates 1") {
    val inp = Array(1, 2, 3, 3, 4, 4, 5)
    val res = processor.deleteDuplicates(
      new ListNode(1,
        new ListNode(2,
          new ListNode(3,
            new ListNode(3,
              new ListNode(4,
                new ListNode(4,
                  new ListNode(5))))))))
    val deduplicated = new ListNode(1, new ListNode(2, new ListNode(5)))

    assertResult(deduplicated)(res)
  }

  test("Remove duplicates 2") {
    val inp = Array(1, 2, 3, 3, 4, 4, 5)
    val res = processor.deleteDuplicates(
      new ListNode(1,
        new ListNode(1,
          new ListNode(1,
            new ListNode(2,
              new ListNode(3))))))
    val deduplicated = new ListNode(2, new ListNode(3))

    assertResult(deduplicated)(res)
  }

}
