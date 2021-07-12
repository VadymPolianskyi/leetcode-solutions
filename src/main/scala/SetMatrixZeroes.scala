package com.polianskyi.leetcode

import scala.annotation.tailrec
import scala.collection.mutable

class SetMatrixZeroes {

  private val coords: mutable.Set[(Int, Int)] = mutable.Set()

  def setZeroes(matrix: Array[Array[Int]]): Unit = {
    goThrough(matrix)
  }

  @tailrec
  private final def goThrough(matrix: Array[Array[Int]], i: Int = 0, j: Int = 0): Unit = {
    def update(j: Int, i: Int): Unit =
      if (matrix(j)(i) != 0) {
        matrix(j).update(i, 0)
        val c = (j, i)
        coords += c
      }

    @tailrec
    def updateRow(row: Int, col: Int = 0): Unit = {
      if (col < matrix.head.length) {
        update(row, col)
        updateRow(row, col + 1)
      }
    }

    @tailrec
    def updateCol(col: Int, row: Int = 0): Unit = {
      if (row < matrix.length) {
        update(row, col)
        updateCol(col, row + 1)
      }
    }

    if (j < matrix.length) {
      if (i < matrix.head.length) {
        if (matrix(j)(i) == 0 && !coords.contains((j, i))) {
          updateRow(j)
          updateCol(i)
        }
        goThrough(matrix, i + 1, j)
      } else goThrough(matrix, 0, j + 1)
    }
  }
}
