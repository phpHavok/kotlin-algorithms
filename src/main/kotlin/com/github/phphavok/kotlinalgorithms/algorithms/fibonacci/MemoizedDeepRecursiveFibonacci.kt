package com.github.phphavok.kotlinalgorithms.algorithms.fibonacci

import java.math.BigInteger

class MemoizedDeepRecursiveFibonacci : IFibonacci {
    private val memo = hashMapOf<UInt, BigInteger>()

    override fun fibonacci(n: UInt): BigInteger {
        val deepRecursiveFibonacci = DeepRecursiveFunction<UInt, BigInteger> {
            memo.getOrElse(it) {
                val result = when (it) {
                    0U -> BigInteger.valueOf(0)
                    1U -> BigInteger.valueOf(1)
                    else -> callRecursive(it - 1U) + callRecursive(it - 2U)
                }
                memo[it] = result
                result
            }
        }

        return deepRecursiveFibonacci(n)
    }


}
