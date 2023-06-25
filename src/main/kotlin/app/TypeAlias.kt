package app.app

import app.data.Application

typealias App = Application
typealias Aplikasi = App
typealias Aplikasi2 = app.data2.Application

typealias SupplierType = () -> String

fun sayHello(supplier: SupplierType) = println("Hello ${supplier()}")


fun main() {
	val app = App("Kotlin App")
	val aplikasi = Aplikasi("Kotlin Aplikasi")
	val aplikasi2 = Aplikasi2("Kotlin V2")
	println()
	println(app.name)
	println(aplikasi.name)
	println(aplikasi2.name)
	println()
	sayHello { "Eko" }
}