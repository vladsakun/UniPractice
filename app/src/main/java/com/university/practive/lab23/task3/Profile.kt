package com.university.practive.lab23.task3

data class Figure(val name: String, val width: Int, val height: Int) {
  fun getArea(): Int {
    return width * height
  }
}

enum class AppMode {
  DEBUG,
  RELEASE
}

sealed class Shape {
  class Oval(val radius: Int) : Shape()
  class Line(val length: Int) : Shape()
  class Rectangle(val width: Int, val height: Int) : Shape()
}