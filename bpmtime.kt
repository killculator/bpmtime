package org.killculator.bmptime

fun main(args: Array<String>) {
	val bpm: Int = args[0].toInt()
	val ms: Double = 60000/bpm
	println(ms)
}