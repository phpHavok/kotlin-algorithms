package com.github.phphavok.kotlinalgorithms.algorithms.fibonacci

class RecursiveFibonacciTest : FibonacciTest() {
    override fun getImplementation(): IFibonacci = RecursiveFibonacci()
}