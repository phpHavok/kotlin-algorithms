package com.github.phphavok.kotlinalgorithms.algorithms.fibonacci

import java.math.BigInteger

class RecursiveFibonacci : IFibonacci {
    override fun fibonacci(n: UInt): BigInteger = when (n) {
        0U -> BigInteger.valueOf(0)
        1U -> BigInteger.valueOf(1)
        else -> fibonacci(n - 1U) + fibonacci(n - 2U)
    }
}
