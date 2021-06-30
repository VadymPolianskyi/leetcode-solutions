package com.polianskyi.leetcode

import SpiralMatrix._

import scala.annotation.tailrec

class SpiralMatrix {
  def spiralOrder(matrix: Array[Array[Int]]): List[Int] = {
    val length = matrix.length * matrix.head.length
    moveToDirection(matrix, length).reverse
  }

  @tailrec
  private final def moveToDirection(matrix: Array[Array[Int]], length: Int, x: Int = 0, y: Int = 0, acc: List[Int] = List(), direction: Direction = Right): List[Int] = {
    if (acc.length >= length) return acc

    direction match {
      case Right =>
        if (matrix.head.length <= y || acc.contains(matrix(x)(y)))
          moveToDirection(matrix, length, x + 1, y - 1, acc, Bottom)
        else moveToDirection(matrix, length, x, y + 1, matrix(x)(y) :: acc, direction)
      case Bottom =>
        if (matrix.length <= x || acc.contains(matrix(x)(y)))
          moveToDirection(matrix, length, x - 1, y - 1, acc, Left)
        else moveToDirection(matrix, length, x + 1, y, matrix(x)(y) :: acc, direction)
      case Left =>
        if (y < 0 || acc.contains(matrix(x)(y)))
          moveToDirection(matrix, length, x - 1, y + 1, acc, Top)
        else moveToDirection(matrix, length, x, y - 1, matrix(x)(y) :: acc, direction)
      case Top =>
        if (x < 0 || acc.contains(matrix(x)(y)))
          moveToDirection(matrix, length, x + 1, y + 1, acc, Right)
        else moveToDirection(matrix, length, x - 1, y, matrix(x)(y) :: acc, direction)
    }
  }
}

object SpiralMatrix {

  sealed trait Direction

  case object Right extends Direction

  case object Left extends Direction

  case object Top extends Direction

  case object Bottom extends Direction

}
