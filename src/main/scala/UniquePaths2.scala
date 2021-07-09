package com.polianskyi.leetcode

import scala.annotation.tailrec

class UniquePaths2 {
  def uniquePathsWithObstacles(obstacleGrid: Array[Array[Int]]): Int = {
    if (obstacleGrid == null || obstacleGrid.isEmpty) 0
    else {
      val m = obstacleGrid.length
      val n = obstacleGrid.head.length
      if (obstacleGrid(m - 1)(n - 1) == 1 || obstacleGrid(0)(0) == 1) 0
      else {
        val arr = obstacleGrid.map(a => a.map(v => if (v == 1) 0 else 1))
        allSteps(m, n, arr)
      }
    }
  }

  @tailrec
  private final def allSteps(m: Int, n: Int, array: Array[Array[Int]], cm: Int = 0, cn: Int = 0): Int = {
    if (cn >= n) array(m - 1)(n - 1)
    else if (cm < m) {
      if (cm == 0 && cn == 0) {
        array(cm).update(cn, 1)
        allSteps(m, n, array, cm + 1, cn)
      }
      else if (array(cm)(cn) == 0) {
        allSteps(m, n, array, cm + 1, cn)
      } else {
        val top = if (cm != 0) array(cm - 1)(cn) else 0
        val left = if (cn != 0) array(cm)(cn - 1) else 0
        array(cm).update(cn, top + left)
        allSteps(m, n, array, cm + 1, cn)
      }
    } else
      allSteps(m, n, array, 0, cn + 1)
  }
}
