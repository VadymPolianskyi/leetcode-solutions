package com.polianskyi.leetcode

import scala.annotation.tailrec

class SimplifyPath {
  def simplifyPath(path: String): String = {
    val cleared = simplifySlashes(path).split("/")
      .filter(s => s.trim.nonEmpty)
      .toList
    simplify(cleared)
  }

  @tailrec
  private final def simplify(path: List[String], acc: List[String] = Nil): String = path match {
    case "." :: tail => simplify(tail, acc)
    case ".." :: tail => if (acc.nonEmpty) simplify(tail, acc.tail) else simplify(tail, Nil)
    case name :: tail => simplify(tail, name :: acc)
    case Nil => if (acc.nonEmpty) acc.reverse.mkString("/", "/", "") else "/"
  }

  @tailrec
  private final def simplifySlashes(path: String): String =
    if (path.contains("//")) simplifySlashes(path.replaceAll("//", "/"))
    else if (path.endsWith("/")) simplifySlashes(path.init)
    else path
}
