package com.polianskyi.leetcode

import scala.annotation.tailrec

class FindFirstAndLastPositionOfElementInSortedArray {
  def searchRange(nums: Array[Int], target: Int): Array[Int] = {
    search(nums, target, 0, nums.length - 1)
  }

  @tailrec
  private final def search(nums: Array[Int], target: Int, left: Int, right: Int): Array[Int] = {
    if (left > right) return Array(-1, -1)

    val mid = left + ((right - left) / 2)

    if (nums(mid) == target) return findNear(nums, target, mid)
    if (nums(left) == target) return findNear(nums, target, left)
    if (nums(right) == target) return findNear(nums, target, right)

    if (nums(left) < target && target < nums(mid)) search(nums, target, left + 1, mid - 1)
    else search(nums, target, mid + 1, right - 1)
  }

  private def findNear(nums: Array[Int], target: Int, index: Int): Array[Int] = {
    Array(findLeftEnd(nums, target, index), findRightEnd(nums, target, index))
  }

  @tailrec
  private final def findLeftEnd(nums: Array[Int], target: Int, index: Int): Int = {
    if (index >= 0 && nums(index) == target) findLeftEnd(nums, target, index - 1)
    else index + 1
  }

  @tailrec
  private final def findRightEnd(nums: Array[Int], target: Int, index: Int): Int = {
    if (index < nums.length && nums(index) == target) findRightEnd(nums, target, index + 1)
    else index - 1
  }
}
