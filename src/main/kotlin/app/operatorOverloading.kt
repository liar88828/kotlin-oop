package app.app

import app.data.Fruit

fun main() {
	val fruit1 = Fruit(100)
	val fruit2 = Fruit(100)
//	val fruit3 = fruit1.plus(fruit2)
//	println(fruit3.quantity)
	val fruit3 = fruit2 + fruit1
	val fruit4 = fruit3 - Fruit(10)
	println(fruit3.quantity)
	println(fruit4.quantity)
}