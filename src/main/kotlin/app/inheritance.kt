package app.app

import app.data.Manager
import app.data.VicePresident

fun main() {

	val manager = Manager("Eko")
	manager.sayHello("Budi")

	val vicePresident = VicePresident("Budi")
	vicePresident.sayHello("Joko")
}