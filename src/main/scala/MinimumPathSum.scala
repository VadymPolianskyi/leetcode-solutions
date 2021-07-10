package com.polianskyi.leetcode

import scala.annotation.tailrec

class MinimumPathSum {
  def minPathSum(grid: Array[Array[Int]]): Int = {
    if (grid == null || grid.isEmpty) 0
    else if (grid.length == 1 && grid.head.length == 1) grid(0)(0)
    else goThrough(grid)
  }

  @tailrec
  private final def goThrough(grid: Array[Array[Int]], m: Int = 0, n: Int = 0): Int = {
    if (m >= grid.length) grid(m - 1)(grid.head.length - 1)
    else if (m == 0 && n == 0) goThrough(grid, m, n + 1)
    else if (n < grid.head.length) {
      val elem = grid(m)(n)
      val fromTop = if (m > 0) grid(m - 1)(n) + elem else Int.MaxValue
      val fromLeft = if (n > 0) grid(m)(n - 1) + elem else Int.MaxValue
      val minSum = math.min(fromTop, fromLeft)
      grid(m).update(n, minSum)
      goThrough(grid, m, n + 1)
    } else goThrough(grid, m + 1)
  }
}
