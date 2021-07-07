package com.polianskyi.leetcode

import scala.annotation.tailrec

class MergeIntervals {
  def merge(intervals: Array[Array[Int]]): Array[Array[Int]] = {
    recMerge(intervals.sortBy(_(1)))
  }

  @tailrec
  private final def recMerge(intervals: Array[Array[Int]]): Array[Array[Int]] = {
    val merged = seqMerge(intervals)

    if (!(merged sameElements intervals)) recMerge(merged)
    else merged
  }

  @tailrec
  private final def seqMerge(intervals: Array[Array[Int]], i: Int = 0, acc: Array[Array[Int]] = Array(), previousEnd: Int = -1): Array[Array[Int]] = {
    if (i > intervals.length - 1) acc
    else {
      val current = intervals(i)
      if (current(0) <= previousEnd) {
        val last = acc.last
        last.update(0, math.min(current(0), last(0)))
        last.update(1, math.max(current(1), last(1)))
        seqMerge(intervals, i + 1, acc, current(1))
      } else {
        if (previousEnd != -1) acc.last.update(1, previousEnd)
        seqMerge(intervals, i + 1, acc :+ current, current(1))
      }
    }
  }
}
