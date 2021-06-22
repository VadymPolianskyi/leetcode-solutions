package com.polianskyi.leetcode

class PowXN {

  def myPow(x: Double, n: Int): Double = {
    def powIter(x: Double, n: Int): Double = {
      if (n == 0) 1
      else if (x == 1) 1
      else if (n % 2 == 0) powIter(x * x, n / 2)
      else x * powIter(x * x, n / 2)
    }


    if (n < 0) {
      if (n == Int.MinValue) {
        1 / myPow(x, -(n + 1)) / x
      }
      else 1 / myPow(x, -n)
    }
    else powIter(x, n)
  }
}