package com.polianskyi.leetcode

import scala.annotation.tailrec

class WordSearch {
  def exist(board: Array[Array[Char]], word: String): Boolean = {
    check(board, word)
  }

  @tailrec
  private final def check(board: Array[Array[Char]], word: String, i: Int = 0, j: Int = 0): Boolean = {
    if (i > board.length - 1) false
    else {
      if (j > board.head.length - 1) check(board, word, i + 1)
      else {
        val el = board(i)(j)
        if (el == word.head)
          checkAround(board, word.tail, i, j) ||
            check(board, word, i, j + 1)
        else check(board, word, i, j + 1)
      }
    }
  }

  private def checkAround(board: Array[Array[Char]], word: String, i: Int, j: Int, passed: Set[(Int, Int)] = Set()): Boolean = {
    def valid(ii: Int, jj: Int): Boolean = !passed.contains((ii, jj))

    word.isEmpty ||
      (if (i > 0 && valid(i - 1, j) && board(i - 1)(j) == word.head)
        checkAround(board, word.tail, i - 1, j, passed + ((i, j)))
      else false) ||
      (if (i < board.length - 1 && valid(i + 1, j) && board(i + 1)(j) == word.head)
        checkAround(board, word.tail, i + 1, j, passed + ((i, j)))
      else false) ||
      (if (j < board.head.length - 1 && valid(i, j + 1) && board(i)(j + 1) == word.head)
        checkAround(board, word.tail, i, j + 1, passed + ((i, j)))
      else false) ||
      (if (j > 0 && valid(i, j - 1) && board(i)(j - 1) == word.head)
        checkAround(board, word.tail, i, j - 1, passed + ((i, j)))
      else false)
  }
}
