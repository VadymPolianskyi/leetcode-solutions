package com.polianskyi.leetcode

import scala.annotation.tailrec

class SearchInRotatedSortedArray {
  def search(nums: Array[Int], target: Int): Int = {
    search(nums, target, 0, nums.length - 1)
  }

  @tailrec
  private final def search(nums: Array[Int], target: Int, left: Int, right: Int): Int = {
    if (left > right) return -1

    val middle = left + (right - left) / 2

    if (nums(middle) == target) return middle
    if (nums(left) == target) return left
    if (nums(right) == target) return right

    if (nums(left) <= nums(middle)) {
      if (nums(left) < target && target < nums(middle)) {
        search(nums, target, left, middle - 1)
      } else {
        search(nums, target, middle + 1, right)
      }
    } else {
      if (nums(middle) < target && target < nums(right)) {
        search(nums, target, middle + 1, right)
      } else {
        search(nums, target, left, middle - 1)
      }
    }
  }
}
