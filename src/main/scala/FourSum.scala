package com.polianskyi.leetcode

import scala.annotation.tailrec

class FourSum {
  def fourSum(nums: Array[Int], target: Int): List[List[Int]] = {
    findFour(nums.sorted, target).toList
  }

  @tailrec
  final def findFour(nums: Array[Int], target: Int, index: Int = 0, found: Set[List[Int]] = Set()): Set[List[Int]] = {
    if (index > nums.length - 3) found
    else {
      val dEl = nums(index)
      val three = findThreeForDel(nums, dEl, target, index + 1)
      findFour(nums, target, index + 1, found ++ three)
    }
  }

  @tailrec
  final def findThreeForDel(nums: Array[Int], dEl: Int, target: Int, index: Int, found: Set[List[Int]] = Set()): Set[List[Int]] = {
    if (index > nums.length - 2) found
    else {
      val fEl = nums(index)
      val two = findTwo(nums, dEl, fEl, target, index + 1, nums.length - 1)
      findThreeForDel(nums, dEl, target, index + 1, found ++ two)
    }
  }

  @tailrec
  final def findTwo(nums: Array[Int], dEl: Int, fEl: Int, target: Int, g: Int, h: Int, found: Set[List[Int]] = Set()): Set[List[Int]] = {
    if (h > g) {
      val gEl = nums(g)
      val hEl = nums(h)
      val sum = dEl + fEl + gEl + hEl

      if (sum == target) findTwo(nums, dEl, fEl, target, g + 1, h - 1, found + List(dEl, fEl, gEl, hEl))
      else {
        if (sum > target) findTwo(nums, dEl, fEl, target, g, h - 1, found)
        else findTwo(nums, dEl, fEl, target, g + 1, h, found)
      }
    } else found
  }
}
