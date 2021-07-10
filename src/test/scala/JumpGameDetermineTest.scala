package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class JumpGameDetermineTest extends AnyFunSuite {

  private val jumpGame = new JumpGameDetermine()

  test("Count 1") {
    val res = jumpGame.canJump(Array(2, 3, 1, 1, 4))
    assertResult(true)(res)
  }

  test("Count 2") {
    val res = jumpGame.canJump(Array(2,3,0,1,4))
    assertResult(true)(res)
  }

  test("Count 3") {
    val res = jumpGame.canJump(Array(2, 1))
    assertResult(true)(res)
  }

  test("Count 4") {
    val res = jumpGame.canJump(Array(3,2,1))
    assertResult(true)(res)
  }

  test("Count 5") {
    val res = jumpGame.canJump(Array(2,3,1))
    assertResult(true)(res)
  }

  test("Count 6") {
    val res = jumpGame.canJump(Array(5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5))
    assertResult(true)(res)
  }

  test("Count 7") {
    val res = jumpGame.canJump(Array(3,2,1,0,4))
    assertResult(false)(res)
  }

  test("Count 8") {
    val res = jumpGame.canJump(Array(2,0,0,0,2,0,0,0))
    assertResult(false)(res)
  }

}


