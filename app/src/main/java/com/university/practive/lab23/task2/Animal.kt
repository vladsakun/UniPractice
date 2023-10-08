package com.university.practive.lab23.task2

interface MakeSound {
  fun noisySound()
  fun quietSound()
}

abstract class Animal {
  val name: String = "Animal"
  val age: Int = 0
  val weight: Double = 0.0

  private val isAlive: Boolean = true

  abstract fun move()
}

class Dog : Animal(), MakeSound {
  val color: String = "Black"
  val breed: String = "Labrador"

  override fun move() {
    println("I'm running!")
  }

  override fun noisySound() {
    println("Woof!")
  }

  override fun quietSound() {
    println("Whimper!")
  }
}

class Fish : Animal() {
  private val legsCount: Int = 0
  private val isSwimming: Boolean = true

  override fun move() {
    println("I'm swimming!")
  }
}

class Bird : Animal(), MakeSound {
  private val wingsCount: Int = 2

  // For loop example
  override fun move() {
    for (i in 1..wingsCount) {
      fly()
    }

    println("I'm flying!")
  }

  private fun fly() {
    println("Flap!")
  }

  override fun noisySound() {
    println("Chirp!")
  }

  override fun quietSound() {
    noisySound()
  }
}