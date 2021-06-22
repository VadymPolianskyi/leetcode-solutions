package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class PowXNTest extends AnyFunSuite {

  private val power = new PowXN()

  test("Pow 1") {
    val res = power.myPow(2.00000, 10)
    assertResult(1024.00000)(res)
  }

  test("Pow 2") {
    val res = power.myPow(2.10000, 3).toString.take(8).toDouble
    assertResult(9.26100)(res)
  }

  test("Pow 3") {
    val res = power.myPow(2.00000, -2)
    assertResult(0.25000)(res)
  }

  test("Pow 4") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = power.myPow(0.00001, 2147483647)
      assertResult(0.0)(res)
    }
  }

  test("Pow 5") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = power.myPow(0.3, 2147483647)
      assertResult(0.0)(res)
    }
  }

  test("Pow 6") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = power.myPow(1.00012, 1024).toString.take(8).toDouble
      assertResult(1.13074)(res)
    }
  }

}


