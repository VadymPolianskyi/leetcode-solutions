package com.polianskyi.leetcode

import AssertHelper.compareArraysIfEquals

import org.scalatest.funsuite.AnyFunSuite

class RotateImageTest extends AnyFunSuite {

  private val processor = new RotateImage()

  test("Rotate image 1") {
    val image = Array(Array(1, 2, 3), Array(4, 5, 6), Array(7, 8, 9))
    processor.rotate(image)
    val rotated = Array(Array(7, 4, 1), Array(8, 5, 2), Array(9, 6, 3))
    assert(compareArraysIfEquals(rotated, image))
  }

  test("Rotate image 2") {
    val image = Array(Array(5, 1, 9, 11), Array(2, 4, 8, 10), Array(13, 3, 6, 7), Array(15, 14, 12, 16))
    processor.rotate(image)
    val rotated = Array(Array(15, 13, 2, 5), Array(14, 3, 4, 1), Array(12, 6, 8, 9), Array(16, 7, 10, 11))
    assert(compareArraysIfEquals(rotated, image))
  }

  test("Rotate image 3") {
    val image = Array(Array(1))
    processor.rotate(image)
    val rotated = Array(Array(1))
    assert(compareArraysIfEquals(rotated, image))
  }

  test("Rotate image 4") {
    val image = Array(Array(1, 2), Array(3, 4))
    processor.rotate(image)
    val rotated = Array(Array(3, 1), Array(4, 2))
    assert(compareArraysIfEquals(rotated, image))
  }


}


