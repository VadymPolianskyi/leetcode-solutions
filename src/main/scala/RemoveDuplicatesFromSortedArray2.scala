package com.polianskyi.leetcode

class RemoveDuplicatesFromSortedArray2 {
  def removeDuplicates(nums: Array[Int]): Int = {
    val n = nums.length
    if (n < 3) n
    else {
      var s, f = 2
      while (f < n) {
        if (nums(f) != nums(s - 2)) {
          nums.update(s, nums(f))
          s += 1
        }
        f += 1
      }
      s
    }
  }
}
