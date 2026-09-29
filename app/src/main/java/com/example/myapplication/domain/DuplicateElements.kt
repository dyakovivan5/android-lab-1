package com.example.myapplication.domain

import kotlin.random.Random

object DuplicateElements {

    fun generateNumbers(): List<Int> {
        return List(10) { Random.nextInt(1, 6) }
    }

    fun find(numbers: List<Int>): List<Int> {
        return numbers
            .groupingBy { it }
            .eachCount()
            .filter { it.value > 1 }
            .keys
            .toList()
    }
}