package com.polianskyi.leetcode

import scala.collection.immutable.ListMap

class IntegerToRoman {

  val db: Map[Int, String] = ListMap(
    1000 -> "M",
    900 -> "CM",
    500 -> "D",
    400 -> "CD",
    100 -> "C",
    90 -> "XC",
    50 -> "L",
    40 -> "XL",
    10 -> "X",
    9 -> "IX",
    5 -> "V",
    4 -> "IV",
    1 -> "I",
  )

  def intToRoman(num: Int): String = {
    db.foldLeft (("", num)) {
      case ((acc, n), (checkNum, symb)) =>
        val times = n / checkNum
        val newAcc = acc + List.fill(times)(symb).mkString("")
        (newAcc, n - (checkNum * times))
    }._1
  }
}
