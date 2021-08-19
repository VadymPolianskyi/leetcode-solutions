package com.polianskyi.leetcode

import scala.annotation.tailrec

class SearchInRotatedSortedArray2 {
  def search(nums: Array[Int], target: Int): Boolean = {
    if (nums.length == 1) nums.head == target
    else binSearch(nums, target, 0, nums.length - 1)
  }

  @tailrec
  private final def binSearch(nums: Array[Int], target: Int, left: Int, right: Int): Boolean = {
    if (left <= right) {
      val piv = left + (right - left) / 2

      if (nums(piv) == target) return true
      if (nums(left) == target) return true
      if (nums(right) == target) return true

      if (nums(right) > target) {
        if (nums(piv) < target) binSearch(nums, target, piv + 1, right - 1)
        else binSearch(nums, target, left + 1, right - 1)
      } else if (nums(left) < target) {
        if (nums(piv) > target) binSearch(nums, target, left + 1, piv - 1)
        else binSearch(nums, target, left + 1, right - 1)
      } else false
    } else false
  }
}
