package app.app

import data.Person

fun main() {
	val eko = Person()
	eko.firstName = "eko"
	eko.sayHello("Budi")
	eko.sayHello("Joko", "Nugroho")

}