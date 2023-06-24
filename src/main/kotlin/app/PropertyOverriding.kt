package app.app

import app.data.Rectangle
import app.data.Shape
import app.data.Triangle

fun main() {
	val shape = Shape()
	println(shape.corner)
	val rectangle = Rectangle()
	println(rectangle.corner)
	val triangle = Triangle()
	println(triangle.corner)
}