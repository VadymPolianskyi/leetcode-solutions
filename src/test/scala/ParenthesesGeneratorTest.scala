package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite
import org.scalatest.matchers.must.Matchers.contain
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class ParenthesesGeneratorTest  extends AnyFunSuite  {

  private val generator = new ParenthesesGenerator()

  test("Convert from 1") {
    val res = generator.generateParenthesis(1)
    assertResult(List("()"))(res)
  }

  test("Convert from 3") {
    val res = generator.generateParenthesis(3)
    res should contain theSameElementsAs List("((()))","(()())","(())()","()(())","()()()")
  }

  test("Convert from 4") {
    val res = generator.generateParenthesis(4)
    val expected = List("(((())))","((()()))","((())())","((()))()","(()(()))","(()()())","(()())()","(())(())","(())()()","()((()))","()(()())","()(())()","()()(())","()()()()")
//    (())(())

    res should contain theSameElementsAs expected
  }

  test("Convert from 8") {
    val res = generator.generateParenthesis(8)
    assert(res.size == 1094)
  }

}
