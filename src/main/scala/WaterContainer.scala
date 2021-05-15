package com.polianskyi.leetcode

import Math.{max, min, abs}
import scala.annotation.tailrec

class WaterContainer {
  def maxArea(height: Array[Int]): Int = {
    val sliceLimit = if (height.length > 1000) predictSliceLimit(height) else 2
    println(s"Slice Limit: $sliceLimit")
    val result = findBySliding(height, height.length, 0)(sliceLimit)
    println(s"Max Area: $result")
    result
  }

  private def predictSliceLimit(height: Array[Int]): Int = {
    if (height.length < 2) 2
    else {
      val cloneArr = height.clone()

      scala.util.Sorting.quickSort(cloneArr)
      val firstMax = cloneArr(cloneArr.length - 1)
      val secondMax = cloneArr(cloneArr.length - 2)
      val firstI = height.indexOf(firstMax)
      val firstLi = height.lastIndexOf(firstMax)
      val secondI = height.indexOf(secondMax)
      val secondLi = height.lastIndexOf(secondMax)

      max(
        max(
          max(abs(firstI - secondI), abs(firstI - secondLi)),
          max(abs(firstLi - secondI), abs(firstLi - secondLi)),
        ),
        2
      )
    }
  }

  @tailrec
  private def findBySliding(height: Array[Int], slice: Int, lastMax: Int)(implicit sliceLimit: Int): Int = {
    if (slice < sliceLimit) lastMax
    else {
      val foundMax = slideAndFindMaxArea(height, lastMax, 0)(slice)
      findBySliding(height, slice - 1, max(foundMax, lastMax))
    }
  }

  @tailrec
  private def slideAndFindMaxArea(height: Array[Int], lastMax: Int, shorterX: Int)(implicit slice: Int): Int = {
    val y = slice - 1
    if (height.length < slice) lastMax
    else if (height.head < shorterX || height(y) < shorterX)
      slideAndFindMaxArea(height.tail, lastMax, shorterX)
    else {
      val x = min(height.head, height(y))
      val maxArea = max(x * y, lastMax)
      slideAndFindMaxArea(height.tail, maxArea, x)
    }
  }
}
