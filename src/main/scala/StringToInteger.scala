package com.polianskyi.leetcode

import scala.annotation.tailrec

class StringToInteger {
  def myAtoi(s: String): Int = {
    val strRes = read(s.trim, "")
    try strRes.toInt
    catch {
      case _: NumberFormatException => if (strRes.startsWith("-")) Int.MinValue else Int.MaxValue
    }
  }

  def containsDigits(str: String): Boolean = str.exists(_.isDigit)

  @tailrec
  private def read(s: String, acc: String): String = {
    if (s.isEmpty) {
      if (!containsDigits(acc)) "0" else acc
    } else s.head match {
      case ch if (ch == '-' || ch == '+') && acc.isEmpty => read(s.tail, ch.toString)
      case ch: Char if ch.isDigit => read(s.tail, acc + ch)
      case _ if !containsDigits(acc) => "0"
      case _ => acc
    }
  }
}
