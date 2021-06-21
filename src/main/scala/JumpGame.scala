package com.polianskyi.leetcode

import scala.annotation.tailrec

class JumpGame {
  def jump(nums: Array[Int]): Int = {
    jumpByStep(nums)
  }

  @tailrec
  private final def jumpByStep(nums: Array[Int], index: Int = 0, jumps: Int = 0): Int = {
    if (index == nums.length - 1 || index >= nums.length - 1) jumps
    else if (index + nums(index) >= nums.length - 1) jumps + 1
    else {
      val el = nums(index)
      if (el != 0) {
        val range = (1 to el).map(j => if (index + j > nums.length - 1) -1 else j + nums(index + j))
        val step = if (range.max > el) range.indexOf(range.max) + 1 else el
        jumpByStep(nums, index + step, jumps + 1)
      } else nums.length
    }
  }
}
