package com.polianskyi.leetcode

class CombinationSum {
  def combinationSum(candidates: Array[Int], target: Int): List[List[Int]] = {
    find(candidates, target).reverse
  }

  private def find(candidates: Array[Int], target: Int, index: Int = 0, acc: List[List[Int]] = List(), localAcc: List[Int] = List()): List[List[Int]] = {
    if (target == 0) localAcc.sorted :: acc
    else if (index >= candidates.length) acc
    else {
      val next = candidates(index)
      if (target - next >= 0) find(candidates, target, index + 1, acc, localAcc) :::
        find(candidates, target - next, index, acc, next :: localAcc)
      else find(candidates, target, index + 1, acc, localAcc)
    }
  }
}
