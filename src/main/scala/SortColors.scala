package com.polianskyi.leetcode

import scala.annotation.tailrec

class SortColors {
  def sortColors(nums: Array[Int]): Unit = {
    if (!(nums.length == 0 || nums.length == 1)) sort(nums, to = nums.length - 1)
  }

  @tailrec
  private final def sort(nums: Array[Int], i: Int = 0, from: Int = 0, to: Int): Unit = {
    def swap(i: Int, j: Int): Unit = {
      val st = nums(i)
      nums.update(i, nums(j))
      nums.update(j, st)
    }

    if (i <= to) {
      val el = nums(i)
      if (el == 0) {
        swap(i, from)
        sort(nums, i + 1, from + 1, to)
      } else if (el == 2) {
        swap(i, to)
        sort(nums, i, from, to - 1)
      } else {
        sort(nums, i + 1, from, to)
      }
    }
  }
}
