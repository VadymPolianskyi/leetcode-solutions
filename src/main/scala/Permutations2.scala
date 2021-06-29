package com.polianskyi.leetcode

class Permutations2 {
  def permuteUnique(nums: Array[Int]): List[List[Int]] = perm(nums).distinct

  def perm(nums: Array[Int], i: Int = 0): List[List[Int]] = {
    if (i > nums.length - 1) Nil
    else if (nums.length < 2 ) List(List(nums.head))
    else {
      val arr = swap(nums ,i, 0)
      val f = arr(0)
      perm(arr.tail).map(v => f::v) ::: perm(nums, i + 1)
    }
  }

  def swap(nums: Array[Int], n: Int, m: Int): Array[Int] = {
    val copy: Array[Int] = nums.map(f => f)
    val nEl = copy(n)
    copy.update(n, copy(m))
    copy.update(m, nEl)
    copy
  }
}
