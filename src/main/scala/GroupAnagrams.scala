package com.polianskyi.leetcode

import scala.annotation.tailrec

class GroupAnagrams {
  def groupAnagrams(strs: Array[String]): List[List[String]] = {
    val sorted = strs.sortBy(_.length)
    (sorted.indices map (i => group(sorted, i, sorted(i).sorted)))
      .filter(_.nonEmpty)
      .toList.reverse
  }

  @tailrec
  private final def group(strs: Array[String], index: Int, el: String, acc: List[String] = List()): List[String] = {
    if (el == "_") Nil
    else if (index > strs.length - 1 || strs(index).length > el.length) acc
    else {
      val el2 = strs(index)

      if (el == el2.sorted) {
        strs.update(index, "_")
        group(strs, index + 1, el, el2 :: acc)
      } else group(strs, index + 1, el, acc)
    }
  }
}
