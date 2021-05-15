package com.polianskyi.leetcode

object BenchmarkUtil {
  def withBenchmarkCheck[R](f: () => R, timeLimit: Int = 5): R = {
    val start = System.currentTimeMillis()
    val result = f()
    val end = System.currentTimeMillis()
    val benchmarkResult = (end - start) / 1000
    println(s"Benchmark: $benchmarkResult")
    assert(benchmarkResult <= timeLimit)
    result
  }
}
