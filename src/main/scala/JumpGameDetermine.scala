package com.polianskyi.leetcode

import scala.annotation.tailrec

class JumpGameDetermine {
  def canJump(nums: Array[Int]): Boolean =
    if (nums.length == 1) true
    else if (nums.head == 0) false
    else check(nums)

  @tailrec
  private final def check(nums: Array[Int], i: Int = 0, lastJump: Int = 0): Boolean = {
    if (i >= nums.length - 1) true
    else {
      val el = nums(i)
      if (el == 0) if (lastJump <= 1) false else check(nums, i - (lastJump - 1))
      else {
        val range = (1 to el).map(j => if (i + j > nums.length - 1) -1 else j + nums(i + j))
        val jump = if (range.max > el) range.indexOf(range.max) + 1 else el
        check(nums, i + jump, jump)
      }
    }
  }

}
