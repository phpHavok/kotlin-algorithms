package com.github.phphavok.kotlinalgorithms.algorithms.fibonacci

import kotlin.system.measureTimeMillis

private const val MAX_TIME_MS = 1000

fun main() {
    val implementations: Array<IFibonacci> = arrayOf(
        RecursiveFibonacci()
    )
    println("Benchmarking ${implementations.size} fibonacci implementations.")
    println("Time limit is $MAX_TIME_MS ms per run.")
    for (implementation in implementations) {
        println("Current implementation: ${implementation::class.simpleName}")
        for (i in 0L..Long.MAX_VALUE) {
            var result: Long
            val timeElapsed = measureTimeMillis {
                result = implementation.fibonacci(i)
            }
            println("fib($i) = $result (calculated in $timeElapsed ms)")

            if (timeElapsed > MAX_TIME_MS) break
        }
    }
}
