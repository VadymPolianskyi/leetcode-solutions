package com.polianskyi.leetcode

import scala.annotation.tailrec

class UniquePaths {
  def uniquePaths(m: Int, n: Int): Int = {
    allSteps(m, n)
  }

  @tailrec
  private final def allSteps(m: Int, n: Int, cm: Int = 1, cn: Int = 0, array: Array[Array[Int]] = Array()): Int = {
    if (cn >= n) array(m - 1)(n - 1)
    else {
      if (array.isEmpty) allSteps(m, n, 1, 0, Array.fill(m)(Array.fill(n)(1)))
      else {
        if (cm < m) {
          val top = array(cm - 1)(cn)
          val left = if (cn != 0) array(cm)(cn - 1) else 0
          array(cm).update(cn, top + left)
          allSteps(m, n, cm + 1, cn, array)
        } else
          allSteps(m, n, 1, cn + 1, array)
      }
    }
  }
}
