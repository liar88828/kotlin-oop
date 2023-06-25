package app.app

import app.data.Minus
import app.data.Modulo
import app.data.Operation
import app.data.Plus

fun operation(value1: Int, value2: Int, operation: Operation): Int {
	return when (operation) {
		is Plus -> value1 + value2
		is Minus -> value1 - value2
		is Modulo -> value1 % value2
	}
}

fun main() {
	println(operation(10, 3, Plus()))
	println(operation(10, 3, Minus()))
	println(operation(10, 3, Modulo()))
}