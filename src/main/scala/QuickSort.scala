package com.polianskyi.leetcode

class QuickSort {
  def quickSort(nums: Array[Int]): Array[Int] =
    if (nums.length <= 1) nums
    else {
      val pivot = nums.head
      val (before, after) = nums.tail.partition(_ < pivot)
      Array.concat(quickSort(before), Array(pivot), quickSort(after)
      )
    }
}
