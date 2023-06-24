package app.app

import data.Car

fun main() {
	val toyota = Car("Toyota", 2002)
	val almaz = Car("Almaz", 2003)

	println(toyota.brand)
	println(toyota.year)
	println(almaz.brand)
	println(almaz.year)
}