package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class RemoveDuplicatesFromSortedArray2Test extends AnyFunSuite {

  private val processor = new RemoveDuplicatesFromSortedArray2()

  test("Remove duplicates 1") {
    val inp = Array(1, 1, 1, 2, 2, 3)
    val k = processor.removeDuplicates(inp)
    val removed = Array(1, 1, 2, 2, 3, 3)

    assertResult(5)(k)
    assertResult(removed)(inp)
  }

  test("Remove duplicates 2") {
    val inp = Array(0, 0, 1, 1, 1, 1, 2, 3, 3)
    val k = processor.removeDuplicates(inp)
    val removed = Array(0, 0, 1, 1, 2, 3, 3, 3, 3)

    assertResult(7)(k)
    assertResult(removed)(inp)
  }

}
