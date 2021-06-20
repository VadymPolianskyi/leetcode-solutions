package com.polianskyi.leetcode

class MultiplyStrings {
  def multiply(num1: String, num2: String): String = {
    val res = seqMultiply(num1.reverse, num2.reverse).reverse
    if (res.startsWith("0")) {
      val n = res.dropWhile(_ == '0')
      if (n.nonEmpty) n
      else "0"
    } else res
  }

  def seqMultiply(num1: String, num2: String, i2: Int = 0): String = {
    if (i2 < num2.length) {
      val res = List.fill(i2)("0").mkString("") + multiplyForSingle(num1, num2(i2).toString.toInt)
      val resN = seqMultiply(num1, num2, i2 + 1)
      val sum = add(res, resN)
      sum
    } else ""
  }

  def multiplyForSingle(num1: String, multiplier: Int, rest: Int = 0, i1: Int = 0): String = {
    if (i1 < num1.length) {
      val mlt = num1(i1).toString.toInt * multiplier + rest
      val (newRest, newMlt) = separateRest(mlt)
      s"$newMlt${multiplyForSingle(num1, multiplier, newRest, i1 + 1)}"
    } else {
      if (rest != 0) rest.toString
      else ""
    }
  }

  def add(num1: String, num2: String, i: Int = 0, rest: Int = 0): String = {
    if (i < num1.length && i < num2.length) {
      val n1 = num1(i).toString.toInt
      val n2 = num2(i).toString.toInt
      val (newRest, sum) = separateRest(n1 + n2 + rest)
      s"$sum${add(num1, num2, i + 1, newRest)}"
    } else if (i < num1.length) {
      val (newRest, sum) = separateRest(num1(i).toString.toInt + rest)
      s"$sum${add(num1, num2, i + 1, newRest)}"
    } else if (i < num2.length) {
      val (newRest, sum) = separateRest(num2(i).toString.toInt + rest)
      s"$sum${add(num1, num2, i + 1, newRest)}"
    } else {
      if (rest != 0) rest.toString
      else ""
    }
  }

  def separateRest(sum: Int): (Int, Int) =
    if (sum >= 10) {
      val rest = sum / 10
      val newSum = sum - (rest * 10)
      (rest, newSum)
    } else (0, sum)
}