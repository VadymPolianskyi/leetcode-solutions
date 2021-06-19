package com.polianskyi.leetcode

import scala.annotation.tailrec

class CountAndSay {
  def countAndSay(n: Int): String = {
    count(n)
  }

  @tailrec
  private final def count(n: Int, s: String = "", times: Int = 0): String = {
    if (times == 0) count(n, "1", times + 1)
    else if (times >= n) s
    else count(n, say(s.tail, s.head), times + 1)
  }

  @tailrec
  private final def say(s: String, c: Char, ac: String = "", i: Int = 1): String = {
    if (s.length <= 0) s"$ac$i$c"
    else {
      if (s.head == c) say(s.tail, c, ac, i + 1)
      else {
        say(s.tail, s.head, s"$ac$i$c")
      }
    }
  }
}
