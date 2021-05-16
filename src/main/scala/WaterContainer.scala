package com.polianskyi.leetcode

import java.lang.Math.{max, min}
import scala.annotation.tailrec

class WaterContainer {
  def maxArea(height: Array[Int]): Int = findMaximum()(height)

  @tailrec
  private def findMaximum(index: Int = 0, maximum: Int = 0)(implicit height: Array[Int]): Int = {
    if (height.length < (index + 1)) maximum
    else {
      val foundMax = findMaxAreaByIndexes(index, height.length - 1, maximum)
      findMaximum(index + 1, foundMax)
    }
  }

  @tailrec
  private def findMaxAreaByIndexes(i1: Int, i2: Int, maxArea: Int)(implicit height: Array[Int]): Int = {
    val x1 = height(i1)
    val x2 = height(i2)
    val y = i2 - i1
    val optimisticArea = x1 * y

    if (optimisticArea <= maxArea) maxArea
    else if (x2 >= x1) optimisticArea
    else findMaxAreaByIndexes(i1, i2 - 1, max(maxArea, y * min(x1, x2)))
  }
}
