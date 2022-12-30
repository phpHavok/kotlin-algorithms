package com.github.phphavok.kotlinalgorithms.algorithms.fibonacci

class MemoizedFibonacciTest : FibonacciTest() {
    override fun getImplementation(): IFibonacci = MemoizedFibonacci()
}