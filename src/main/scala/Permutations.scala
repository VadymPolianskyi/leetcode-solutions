package com.polianskyi.leetcode

class Permutations {
  def permute(nums: Array[Int]): List[List[Int]] = perm(nums).distinct

  def perm(nums: Array[Int], i1: Int = 0): List[List[Int]] =
    if (i1 > nums.length - 1) List(nums.toList)
    else nums.indices.flatMap(i => perm(swap(nums, i1, i), i1 + 1)).toList


  def swap(nums: Array[Int], n: Int, m: Int): Array[Int] = {
    val copy: Array[Int] = nums.map(f => f)
    val nEl = copy(n)
    copy.update(n, copy(m))
    copy.update(m, nEl)
    copy
  }
}
