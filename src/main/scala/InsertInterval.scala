package com.polianskyi.leetcode

import scala.annotation.tailrec

class InsertInterval {
  def insert(intervals: Array[Array[Int]], newInterval: Array[Int]): Array[Array[Int]] = {
    val beg = insertBefore(intervals, newInterval)
    val (merged, i) = insertMerge(intervals, newInterval, beg.length)
    beg :+ merged :++ insertAfter(intervals, i)
  }

  @tailrec
  private final def insertBefore(inv: Array[Array[Int]], ni: Array[Int], i: Int = 0, acc: Array[Array[Int]] = Array()): Array[Array[Int]] = {
    if (i <= inv.length - 1 && inv(i)(1) < ni(0)) insertBefore(inv, ni, i + 1, acc :+ inv(i))
    else acc
  }

  @tailrec
  private final def insertMerge(inv: Array[Array[Int]], ni: Array[Int], i: Int): (Array[Int], Int) = {
    if (i <= inv.length - 1 && inv(i)(0) <= ni(1)) {
      ni.update(0, math.min(inv(i)(0), ni(0)))
      ni.update(1, math.max(inv(i)(1), ni(1)))
      insertMerge(inv, ni, i + 1)
    } else (ni, i)
  }

  @tailrec
  private final def insertAfter(inv: Array[Array[Int]], i: Int = 0, acc: Array[Array[Int]] = Array()): Array[Array[Int]] = {
    if (i <= inv.length - 1) insertAfter(inv, i + 1, acc :+ inv(i))
    else acc
  }
}
