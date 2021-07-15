package com.polianskyi.leetcode

import scala.annotation.tailrec

class Search2DMatrix {
  def searchMatrix(matrix: Array[Array[Int]], target: Int): Boolean = {
    search(matrix, target)
  }

  @tailrec
  private final def search(matrix: Array[Array[Int]], target: Int, i: Int = 0): Boolean = {
    if (i < matrix.length) {
      val arr = matrix(i)
      if (arr.last >= target) searchInArr(arr, target)
      else search(matrix, target, i + 1)
    } else false
  }

  @tailrec
  private final def searchInArr(array: Array[Int], target: Int, i: Int = 0): Boolean = {
    if (i < array.length) {
      val el = array(i)
      if (el == target) true
      else searchInArr(array, target, i + 1)
    } else false
  }
}
