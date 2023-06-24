package app.app

import data.Person

fun main() {
	val eko = Person()
	eko.firstName = "eko"
	eko.middleName = "kurniawan"
	eko.lastName = "khannedy"
	eko.sayHello("Budi")
	eko.run()
	val fullname = eko.getFullName()
	println(fullname)
}