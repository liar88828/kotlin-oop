package app.app

import app.data.Boss

fun main() {
	val eko = Boss("Eko")
	val budy = eko.Employee("Budi")
	val joko = eko.Employee("Joko")

	println(eko.name)
	println(budy.name)
	budy.hi()
	joko.hi()
}