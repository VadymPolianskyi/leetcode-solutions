package com.polianskyi.leetcode

import scala.annotation.tailrec


class ThreeSum {
  def threeSum(nums: Array[Int]): List[List[Int]] = {
    findAll(nums).distinct.reverse
  }

  @tailrec
  final def findAll(nums: Array[Int], index: Int = 0, checked: Set[Int] = Set(), result: List[List[Int]] = Nil): List[List[Int]] = {
    if (index >= nums.length - 1) result
    else {
      val item = nums(index)
      if (checked.contains(item)) findAll(nums, index + 1, checked, result)
      else {
        val newResult = checkTail(item, nums, result, index + 1)
        findAll(nums, index + 1, checked + item, newResult)
      }
    }
  }

  @tailrec
  final def checkTail(item: Int, nums: Array[Int], resp: List[List[Int]], index: Int): List[List[Int]] = {
    if (index >= nums.length) resp
    else {
      val next = nums(index)
      val negative = (item + next) * -1
      if (checkInArray(negative, nums, index, nums.length - 1)) {
        checkTail(item, nums, List(item, next, negative).sorted :: resp, index + 1)
      } else {
        checkTail(item, nums, resp, index + 1)
      }
    }
  }

  @tailrec
  final def checkInArray(item: Int, sortedArray: Array[Int], fromIndex: Int, lastIndex: Int): Boolean = {
    if (lastIndex <= fromIndex) false
    else if (sortedArray(lastIndex) == item) true
    else checkInArray(item, sortedArray, fromIndex, lastIndex - 1)
  }
}