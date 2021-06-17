package com.polianskyi.leetcode

import scala.annotation.tailrec
import scala.math.abs


class ThreeSumClosest {
  def threeSumClosest(nums: Array[Int], target: Int): Int = {
    find(nums, target)
  }

  @tailrec
  final def find(nums: Array[Int], target: Int, index: Int = 0, checked: Set[Int] = Set(), closest: Int = Int.MaxValue): Int =
    if (index >= nums.length - 1) closest
    else {
      val item = nums(index)
      if (checked.contains(item)) find(nums, target, index + 1, checked, closest)
      else {
        val newClosest = checkTail(item, nums, target, closest, index + 1)
        find(nums, target, index + 1, checked + item, newClosest)
      }
    }

  @tailrec
  final def checkTail(item: Int, nums: Array[Int], target: Int, closest: Int, index: Int): Int =
    if (index >= nums.length) closest
    else {
      val next = nums(index)
      val foundClosest = checkInArray(item + next, nums, target, closest, index + 1)
      checkTail(item, nums, target, foundClosest, index + 1)
    }

  @tailrec
  final def checkInArray(sumPart: Int, array: Array[Int], target: Int, closest: Int, index: Int): Int = {
    if (index >= array.length) closest
    else if (abs(target - (sumPart + array(index))) < abs(target - closest) || closest == Int.MaxValue)
      checkInArray(sumPart, array, target, sumPart + array(index), index + 1)
    else checkInArray(sumPart, array, target, closest, index + 1)
  }
}