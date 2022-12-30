package com.github.phphavok.kotlinalgorithms.algorithms.fibonacci

import kotlin.test.Test
import kotlin.test.assertEquals

abstract class FibonacciTest {
    private val fib = arrayOf(0,1,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,1597,2584,4181)
    private val implementation = getImplementation()

    protected abstract fun getImplementation(): IFibonacci

    @Test
    fun `it evaluates correctly for the first several inputs`() {
        for ((i, n) in fib.withIndex()) {
            assertEquals(n.toLong(), implementation.fibonacci(i.toLong()))
        }
    }
}