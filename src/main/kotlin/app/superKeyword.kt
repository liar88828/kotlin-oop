package app.app

import app.data.Rectangle

fun main() {
	val rectangle = Rectangle()
	println("Corner ${rectangle.corner}")
	println("Corner ${rectangle.parentCorner}")
	rectangle.printName()
}