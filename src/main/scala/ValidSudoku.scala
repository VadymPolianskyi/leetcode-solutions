package com.polianskyi.leetcode

import scala.annotation.tailrec

class ValidSudoku {
  def isValidSudoku(board: Array[Array[Char]]): Boolean = {
    checkColumns(board) && checkLines(board) && checkSquares(board)
  }

  @tailrec
  private final def checkSquares(board: Array[Array[Char]], v: Int = 0, h: Int = 0): Boolean = {
    if (h > 6) return true

    if (v > 6) checkSquares(board, 0, h + 3)
    else {
      if (checkSquare(board, v, h)) checkSquares(board, v + 3, h)
      else false
    }
  }

  @tailrec
  private final def checkSquare(board: Array[Array[Char]], v: Int, h: Int, vStep: Int = 0, hStep: Int = 0, acc: Set[Int] = Set(), nums: Int = 0): Boolean = {
    if (hStep > 2) return acc.size == nums

    if (vStep > 2) checkSquare(board: Array[Array[Char]], v - 3, h + 1, 0, hStep + 1, acc, nums)
    else {
      val line = board(h)
      if (line(v) != '.') checkSquare(board: Array[Array[Char]], v + 1, h, vStep + 1, hStep, acc + line(v).toString.toInt, nums + 1)
      else checkSquare(board: Array[Array[Char]], v + 1, h, vStep + 1, hStep, acc, nums)
    }
  }

  @tailrec
  private final def checkColumns(board: Array[Array[Char]], index: Int = 0): Boolean = {
    if (index > board.length - 1) true
    else {
      if (checkColumn(board, index)) checkColumns(board, index + 1)
      else false
    }
  }

  @tailrec
  private final def checkColumn(board: Array[Array[Char]], constIndex: Int, acc: Set[Int] = Set(), nums: Int = 0, index: Int = 0): Boolean = {
    if (index > board.length - 1) return acc.size == nums
    val row = board(index)
    if (row(constIndex) != '.') checkColumn(board, constIndex, acc + row(constIndex).toString.toInt, nums + 1, index + 1)
    else checkColumn(board, constIndex, acc, nums, index + 1)
  }


  @tailrec
  private final def checkLines(board: Array[Array[Char]], index: Int = 0): Boolean = {
    if (index > board.length - 1) true
    else {
      if (checkLine(board(index))) checkLines(board, index + 1)
      else false
    }
  }

  @tailrec
  private final def checkLine(line: Array[Char], acc: Set[Int] = Set(), nums: Int = 0, index: Int = 0): Boolean = {
    if (index > line.length - 1) return acc.size == nums
    if (line(index) != '.') checkLine(line, acc + line(index).toString.toInt, nums + 1, index + 1)
    else checkLine(line, acc, nums, index + 1)
  }
}
