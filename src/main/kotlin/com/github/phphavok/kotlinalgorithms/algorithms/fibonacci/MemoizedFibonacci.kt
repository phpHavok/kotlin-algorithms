package com.github.phphavok.kotlinalgorithms.algorithms.fibonacci

import java.math.BigInteger

class MemoizedFibonacci : IFibonacci {
    private val memo = hashMapOf<UInt, BigInteger>()

    override fun fibonacci(n: UInt): BigInteger = memo.getOrElse(n) {
        val result = when (n) {
            0U -> BigInteger.valueOf(0)
            1U -> BigInteger.valueOf(1)
            else -> fibonacci(n - 1U) + fibonacci(n - 2U)
        }
        memo[n] = result
        result
    }
}