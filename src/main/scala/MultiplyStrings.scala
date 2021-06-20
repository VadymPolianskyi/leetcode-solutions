package com.polianskyi.leetcode

class MultiplyStrings {
  def multiply(num1: String, num2: String): String = {
    seqMultiply(num1.reverse, num2.reverse).toString
  }

  def seqMultiply(num1: String, num2: String, i1: Int = 0, i2: Int = 0): Int = {
    if (i2 < num2.length) {
      if (i1 < num1.length) {
        val mlt = correctedWithPosition(i1, num1(i1).toString.toInt) * correctedWithPosition(i2, num2(i2).toString.toInt)
        mlt + seqMultiply(num1, num2, i1 + 1, i2)
      } else {
        seqMultiply(num1, num2, 0, i2 + 1)
      }
    } else 0
  }

  def correctedWithPosition(i: Int, n: Int): Int = {
    if (i == 0) n
    else 10 * correctedWithPosition(i - 1, n)
  }
}
