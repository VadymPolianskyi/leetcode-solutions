package com.polianskyi.leetcode

import org.scalatest.funsuite.AnyFunSuite

class DivideTwoIntegersTest extends AnyFunSuite {

  private val divider = new DivideTwoIntegers()

  test("Divide 10 by 3 ") {
    val res = divider.divide(10, 3)
    assertResult(3)(res)
  }

  test("Divide 7 by -3 ") {
    val res = divider.divide(7, -3)
    assertResult(-2)(res)
  }

  test("Divide 0 by 1 ") {
    val res = divider.divide(0, 1)
    assertResult(0)(res)
  }


  test("Divide 1 by 1 ") {
    val res = divider.divide(1, 1)
    assertResult(1)(res)
  }

  test("Divide -100 by 20 ") {
    val res = divider.divide(-100, 20)
    assertResult(-5)(res)
  }

  test("Divide -578344987 by -3 ") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = divider.divide(-578344987, -3)
      assertResult(192781662)(res)
    }
  }

  test("Divide 2147483647 by 2 ") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = divider.divide(2147483647, 2)
      assertResult(1073741823)(res)
    }
  }

  test("Divide 2147483647 by 3 ") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = divider.divide(2147483647, 3)
      assertResult(715827882)(res)
    }
  }

  test("Divide -2147483648 by -3 ") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = divider.divide(-2147483648, -3)
      assertResult(715827882)(res)
    }
  }

  test("Divide 2147483647 by -2147483648") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = divider.divide(2147483647, -2147483648)
      assertResult(0)(res)
    }
  }

  test("Divide -2147483648 by -2147483648") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = divider.divide(-2147483648, -2147483648)
      assertResult(1)(res)
    }
  }

  test("Divide 2147483647 by 2147483647") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = divider.divide(2147483647, 2147483647)
      assertResult(1)(res)
    }
  }

  test("Divide -2147483648 by -1 ") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = divider.divide(-2147483648, -1)
      assertResult(2147483647)(res)
    }
  }

  test("Divide -2147483648 by 1 ") {
    BenchmarkUtil.withBenchmarkCheck { () =>
      val res = divider.divide(-2147483648, 1)
      assertResult(-2147483648)(res)
    }
  }
}
