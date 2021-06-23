package com.polianskyi.leetcode

import com.polianskyi.leetcode.AssertHelper.compareStrListsIfEquals
import org.scalatest.funsuite.AnyFunSuite

class GroupAnagramsTest extends AnyFunSuite {

  private val ga = new GroupAnagrams()

  test("Group Anagrams 1") {
    val res = ga.groupAnagrams(Array("eat", "tea", "tan", "ate", "nat", "bat"))
    compareStrListsIfEquals(List(List("bat"), List("nat", "tan"), List("ate", "eat", "tea")), res)
  }

  test("Group Anagrams 2") {
    val res = ga.groupAnagrams(Array(""))
    assertResult(List(List("")))(res)
  }

  test("Group Anagrams 3") {
    val res = ga.groupAnagrams(Array("a"))
    assertResult(List(List("a")))(res)
  }

  test("Group Anagrams 4") {
    val res = ga.groupAnagrams(Array("uri", "poi", "lka", "iru", "oip", "erui", "jui", "oi", "poi", "eriu", "qo", "io", "iure", "uij"))
    compareStrListsIfEquals(List(List("iure", "eriu", "erui"), List("uij", "jui"), List("lka"), List("poi", "oip", "poi"), List("iru", "uri"), List("qo"), List("io", "oi")), res)
  }
}


