package com.github.phphavok.kotlinalgorithms.algorithms.fibonacci

import java.math.BigInteger
import kotlin.system.measureTimeMillis

private const val MAX_TIME_MS = 1000

fun main() {
    val implementations: Array<IFibonacci> = arrayOf(
        RecursiveFibonacci(),
        MemoizedFibonacci()
    )
    println("Benchmarking ${implementations.size} fibonacci implementations.")
    println("Time limit is $MAX_TIME_MS ms per run.")
    for (implementation in implementations) {
        println("Current implementation: ${implementation::class.simpleName}")
        for (i in 0U..UInt.MAX_VALUE) {
            var result: BigInteger
            val timeElapsed = measureTimeMillis {
                result = implementation.fibonacci(i)
            }
            println("fib($i) = $result (calculated in $timeElapsed ms)")

            if (timeElapsed > MAX_TIME_MS) break
        }
    }
}
