package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class SimplifyPathTest extends AnyFunSuite {

  private val sp = new SimplifyPath()

  test("Simplify path 1") {
    val res = sp.simplifyPath("/home/")
    assertResult("/home")(res)
  }

  test("Simplify path 2") {
    val res = sp.simplifyPath("/../")
    assertResult("/")(res)
  }

  test("Simplify path 3") {
    val res = sp.simplifyPath("/home//foo/")
    assertResult("/home/foo")(res)
  }

  test("Simplify path 4") {
    val res = sp.simplifyPath("/a/./b/../../c/")
    assertResult("/c")(res)
  }

  test("Simplify path 5") {
    val res = sp.simplifyPath("/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/a/./b/../../c/")
    assertResult("/c/c/c/c/c/c/c/c/c/c/c/c/c/c/c/c/c")(res)
  }



}


