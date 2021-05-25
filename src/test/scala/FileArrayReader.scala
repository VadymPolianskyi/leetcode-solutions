package com.polianskyi.leetcode

import scala.io.Source

object FileArrayReader {
  def readArray(line: Int, fileName: String): Array[Int] = {
    val source = Source.fromResource(s"$fileName.txt")
    val a = source.getLines().toList(line - 1)
    source.close()
    a.split(",").map(_.toInt)
  }
}
