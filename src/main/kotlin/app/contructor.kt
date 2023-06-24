package app.app

import data.Car

fun main() {
	val toyota = Car("Toyota")
	val almaz = Car("Almaz", "wuling")

	println(toyota.brand)
	println(almaz.brand)
	println(almaz.year)
}