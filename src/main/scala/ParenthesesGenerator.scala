package com.polianskyi.leetcode

class ParenthesesGenerator {

  def generateParenthesis(n: Int): List[String] = {
    generate(n).distinct
  }

  def generate(n: Int, acc: List[String] = List("()")): List[String] = {
    if (n == 1) acc
    else {
      generate(n - 1, acc.flatMap(created => tune(created)))
    }
  }

  def tune(created: String): List[String] =
    List(s"$created()", s"($created)", s"()$created").distinct

}
//(())(())