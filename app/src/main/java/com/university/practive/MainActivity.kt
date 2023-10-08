package com.university.practive

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.university.practive.lab23.task2.Bird
import com.university.practive.lab23.task2.Dog
import com.university.practive.lab23.task2.Fish
import com.university.practive.lab23.task3.Figure
import com.university.practive.lab23.task3.Shape

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    // Task 2
    val dog = Dog()
    val fish = Fish()
    val bird = Bird()

    val dogName = dog.name
    Log.d(TAG, "onCreate: dog.name = $dogName")

    dog.move()
    fish.move()
    bird.move()

    // Task 3
    val figures = List(10) {
      Figure("Figure $it", it * 10, it * 10)
    }

    var totalArea = 0
    figures.forEach { totalArea += it.getArea() }

    val shapes = listOf<Shape>(
      Shape.Oval(10),
      Shape.Line(10),
      Shape.Line(10),
      Shape.Line(10),
      Shape.Rectangle(10, 10),
      Shape.Rectangle(10, 10),
      Shape.Oval(10),
      Shape.Line(10),
      Shape.Rectangle(10, 10),
      Shape.Oval(10),
      Shape.Line(10),
      Shape.Rectangle(10, 10),
    )

    val ovalCount = shapes.filterIsInstance<Shape.Oval>().count()
    val lineCount = shapes.filterIsInstance<Shape.Line>().count()
    val rectangleCount = shapes.filterIsInstance<Shape.Rectangle>().count()

    var ovalCountWhen = 0
    var lineCountWhen = 0
    var rectangleCountWhen = 0

    shapes.forEach {
      when (it) {
        is Shape.Oval -> ovalCountWhen++
        is Shape.Line -> lineCountWhen++
        is Shape.Rectangle -> rectangleCountWhen++
      }
    }
  }

  companion object {
    private const val TAG = "MainActivity"
  }
}