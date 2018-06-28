package org.killculator.bmptime

fun main(args: Array<String>) {
	val bpm: Int = args[0].toInt()
	val ms: Int = 60000/bpm

	println("Bar:   $ms ms")
	for (i in 1..7){
		val divisor: Int = Math.pow(2.0, i.toDouble()).toInt()
		println("1/${divisor}:   ${ms/(i*2)} ms")
	}
}