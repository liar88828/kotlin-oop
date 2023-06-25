package app.app

import app.data.Application
import app.data.Utilities

fun main() {
	Utilities.name = "Diubah"
	println(Utilities.name)
	println(Utilities.toUpper("Eko"))
	a()
	b()

//	println(Application.Utilises.upper("Eko"))// tanpa companion
	println(Application.upper("Eko"))// dengan companion

}


fun a() = println(Utilities.name)
fun b() = println(Utilities.name)