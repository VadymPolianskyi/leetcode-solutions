package com.polianskyi.leetcode

import scala.annotation.tailrec

class StringToIntConverter {
  def strToInt(s: String): Int =
    if (s.isEmpty) 0
    else if (s.startsWith("-")) {
      val res = convertToInt(s.tail.toList.reverse)
      if (res == -1) Int.MinValue else res * -1
    } else {
      val res = convertToInt(s.toList.reverse)
      if (res == -1) Int.MaxValue else res
    }

  @tailrec
  private final def convertToInt(l: List[Char], acc: Int = 0, step: Int = 0): Int = l match {
    case _ if acc < 0 => -1
    case Nil => acc
    case c :: t =>
      if (step == 0) convertToInt(t, c.toString.toInt, step + 1)
      else convertToInt(t, (c.toString.toInt * math.pow(10, step)).toInt + acc, step + 1)
  }
}
