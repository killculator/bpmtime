package org.killculator.bmptime

fun main(args: Array<String>) {
	if (args.isEmpty()) println("enter a number, dingus") else {

		val bpm: Int = args[0].toInt()
		val ms: Int = 60000 / bpm
		val baseList: List<Int> = listOf(0, 1, 2, 3, 4, 5, 6, 7)

		val divisorList: List<Int> = calculateDivisors(baseList)
		val msList: List<Int> = calculateTimeInMs(baseList, ms)
		val barList: List<String> = formatBarList(baseList, divisorList, msList)

		printBars(baseList, barList)
	}
}

fun calculateDivisors(valueList: List<Int>): List<Int>{
	return valueList
			.map { item -> Math.pow(2.0, item.toDouble()).toInt() }
}

fun calculateTimeInMs(valueList: List<Int>, timeInMs: Int): List<Int>{
	return valueList
			.map { item -> if (item == 0) timeInMs else timeInMs/(item * 2) }

}

fun formatBarList(valueList: List<Int>, divisorList: List<Int>, timeList: List<Int>): List<String>{
	return valueList
			.map { item -> "1/${divisorList.elementAt(item)}:       ${timeList.elementAt(item)} ms" }
}

fun printBars(valueList: List<Int>, barList: List<String>){
	valueList
			.map { item -> println(barList.elementAt(item)) }
}