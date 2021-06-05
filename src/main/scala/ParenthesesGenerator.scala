package com.polianskyi.leetcode

class ParenthesesGenerator {

  def generateParenthesis(n: Int): List[String] = {
    tune(n * 2).distinct
  }

  def tune(limit: Int, acc: List[String] = List("(")): List[String] = {
    if (limit <= 1) acc
    else tune(limit - 1, acc.flatMap(s => add(s, limit)))
  }

  def add(s: String, limit: Int): List[String] = {
    val opened = s.count(_ == '(')
    val closed = s.count(_ == ')')

    if (opened <= closed) List(s"$s(")
    else if (limit == 1 || opened - closed >= limit - 1) List(s"$s)")
    else List(s"$s(", s"$s)")
  }
}