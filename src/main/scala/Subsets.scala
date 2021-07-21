package com.polianskyi.leetcode

class Subsets {
  def subsets(nums: Array[Int]): List[List[Int]] = {
    findSubset(nums).distinct
  }

  def findSubset(nums: Array[Int]): List[List[Int]] = {
    if (nums.length == 1) List(List(), List(nums.head))
    else {
      val el = nums.head
      val sub = findSubset(nums.tail)
      sub ::: sub.map(el :: _)
    }
  }
}
