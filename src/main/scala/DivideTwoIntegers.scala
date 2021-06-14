package com.polianskyi.leetcode

import scala.annotation.tailrec

class DivideTwoIntegers {
  def divide(dividend: Int, divisor: Int): Int = {
    if (divisor == Int.MinValue && dividend != Int.MinValue) return 0
    if (dividend > 0 && divisor < 0) negative(countDivide(dividend, positive(divisor)))
    else if (dividend < 0 && divisor > 0) negative(countDivideNeg(dividend, negative(divisor)))
    else if (dividend < 0 && divisor < 0) positive(countDivideNeg(dividend, divisor))
    else countDivide(dividend, divisor)
  }

  private def positive(n: Int) =
    if (n == Int.MinValue) Int.MaxValue
    else if (n.toString.startsWith("-")) n.toString.tail.toInt
    else n

  private def negative(n: Int) =
    if (n == Int.MinValue) n
    else s"-${n.toString}".toInt

  @tailrec
  private def countDivide(dividend: Int, divisor: Int, acc: Int = 0, counts: Int = 0): Int = {
    val sum = acc + divisor
    if (sum < dividend && !(sum < 0)) countDivide(dividend, divisor, sum, counts + 1)
    else if (sum == dividend) counts + 1
    else counts
  }

  @tailrec
  private def countDivideNeg(dividend: Int, divisor: Int, acc: Int = 0, counts: Int = 0): Int = {
    val sum = acc + divisor
    if (dividend < sum && !(sum > 0)) countDivideNeg(dividend, divisor, sum, counts + 1)
    else if (sum == dividend) counts + 1
    else counts
  }
}
