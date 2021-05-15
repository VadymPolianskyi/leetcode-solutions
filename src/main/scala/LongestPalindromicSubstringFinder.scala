package com.polianskyi.leetcode

import scala.annotation.tailrec

/*
 * Given a string s, return the longest palindromic substring in s.
 */

class LongestPalindromicSubstringFinder {

  def find(s: String): String = findBySliding(s, s.length)

  @tailrec
  private final def findBySliding(s: String, slideSize: Int): String = {
    val found = slideAndFind(s, slideSize)
    if (found.isDefined) found.get
    else findBySliding(s, slideSize - 1)
  }

  @tailrec
  private def slideAndFind(s: String, slideSize: Int): Option[String] = {
    if (slideSize > s.length) None
    else {
      val piece = s.take(slideSize)
      if (piece.reverse == piece) Some(piece)
      else slideAndFind(s.tail, slideSize)
    }
  }
}
