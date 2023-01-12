package com.github.phphavok.kotlinalgorithms.algorithms.fibonacci

import java.math.BigInteger
import kotlin.system.measureTimeMillis
import kotlin.reflect.KClass
import kotlin.reflect.full.createInstance

private const val MAX_TIME_MS = 1000

fun main() {
    val implementations: Array<KClass<out IFibonacci>> = arrayOf(
//        RecursiveFibonacci::class,
//        MemoizedFibonacci::class,
        MemoizedDeepRecursiveFibonacci::class
    )
    println("Benchmarking ${implementations.size} fibonacci implementations.")
    println("Time limit is $MAX_TIME_MS ms per run.")
    for (implementation in implementations) {
        println("Current implementation: ${implementation::class.simpleName}")
        for (i in 0U..UInt.MAX_VALUE) {
            val instance = implementation.createInstance()
            var result: BigInteger
            val timeElapsed = measureTimeMillis {
                result = instance.fibonacci(i)
            }
            println("fib($i) = (calculated in $timeElapsed ms)")

            if (timeElapsed > MAX_TIME_MS) break
        }
    }
}
