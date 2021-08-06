package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class WordSearchTest extends AnyFunSuite {

  private val ws = new WordSearch()

  test("Word search 1") {
    val res = ws.exist(Array(Array('A','B','C','E'),Array('S','F','C','S'),Array('A','D','E','E')), "ABCCED")
    assertResult(true)(res)
  }

  test("Word search 2") {
    val res = ws.exist(Array(Array('A','B','C','E'),Array('S','F','C','S'),Array('A','D','E','E')), "SEE")
    assertResult(true)(res)
  }

  test("Word search 3") {
    val res = ws.exist(Array(Array('A','B','C','E'),Array('S','F','C','S'),Array('A','D','E','E')), "ABCB")
    assertResult(false)(res)
  }
}


