package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class JumpGameTest extends AnyFunSuite {

  private val jumpGame = new JumpGame()

  test("Count 1") {
    val res = jumpGame.jump(Array(2, 3, 1, 1, 4))
    assertResult(2)(res)
  }

  test("Count 2") {
    val res = jumpGame.jump(Array(2,3,0,1,4))
    assertResult(2)(res)
  }

  test("Count 3") {
    val res = jumpGame.jump(Array(2, 1))
    assertResult(1)(res)
  }

  test("Count 4") {
    val res = jumpGame.jump(Array(3,2,1))
    assertResult(1)(res)
  }

  test("Count 5") {
    val res = jumpGame.jump(Array(2,3,1))
    assertResult(1)(res)
  }

  test("Count 6") {
    val res = jumpGame.jump(Array(5,6,4,4,6,9,4,4,7,4,4,8,2,6,8,1,5,9,6,5,2,7,9,7,9,6,9,4,1,6,8,8,4,4,2,0,3,8,5))
    assertResult(5)(res)
  }

}


