package com.github.phphavok.kotlinalgorithms.algorithms.fibonacci

class RecursiveFibonacci : IFibonacci {
    override fun fibonacci(n: Long): Long = when (n) {
        0L -> 0
        1L -> 1
        else -> fibonacci(n - 1) + fibonacci(n - 2)
    }
}