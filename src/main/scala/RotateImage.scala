package com.polianskyi.leetcode

import scala.annotation.tailrec

class RotateImage {
  def rotate(matrix: Array[Array[Int]]): Unit = {
    val clone = matrix.map(v => v.map(identity))
    rotateM(matrix, clone)
  }

  @tailrec
  private final def rotateM(matrix: Array[Array[Int]], copy: Array[Array[Int]], rowIndex: Int = 0): Unit = {
    if (rowIndex < matrix.length) {
      val it: Iterator[Int] = copy(rowIndex).iterator
      matrix.foreach { el =>
        el.update(el.length - 1 - rowIndex, it.next())
      }
      rotateM(matrix, copy, rowIndex + 1)
    }
  }
}
