package app.app

import data.Person

fun main() {
	val eko = Person("Eko", "kurniawan", "khannedy")
	eko.sayHello("Budi")
	eko.run()
	val fullname = eko.getFullName()
	println(fullname)
}