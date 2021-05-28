package com.polianskyi.leetcode

import scala.collection.immutable.ListMap

class PhoneNumberLetterCombinations {

  val keyboard: Map[Int, List[Char]] = ListMap(
    2 -> List('a', 'b', 'c'),
    3 -> List('d', 'e', 'f'),
    4 -> List('g', 'h', 'i'),
    5 -> List('j', 'k', 'l'),
    6 -> List('m', 'n', 'o'),
    7 -> List('p', 'q', 'r', 's'),
    8 -> List('t', 'u', 'v'),
    9 -> List('w', 'x', 'y', 'z')
  )

  def letterCombinations(digits: String): List[String] =
    findCombinations(digits.map(c =>
      keyboard(c.asDigit)))


  def findCombinations(keyboardSymbols: Seq[List[Char]]): List[String] = {
    keyboardSymbols.foldLeft(List[String]())(combine)
  }

  def combine(accumulator: List[String], letters: List[Char]): List[String] = {
    if (accumulator.isEmpty) letters.map(_.toString)
    else {
      accumulator.flatMap(st => letters.map(c => st + c))
    }
  }
}
