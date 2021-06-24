package com.polianskyi.leetcode

class Permutations {
  def permute(nums: Array[Int]): List[List[Int]] = perm(nums).distinct

  def perm(nums: Array[Int], i1: Int = 0, used: Set[Int] = Set(), local: List[Int] = List()): List[List[Int]] =
    if (i1 > nums.length - 1) List(local)
    else nums.indices.filter(!used.contains(_))
        .flatMap(v => perm(nums, i1 + 1, used + v, nums(v) :: local)).toList
}
