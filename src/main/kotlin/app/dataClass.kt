package app.app

import app.data.Product

fun main() {
	val product = Product("Indome", 5_000, "Food")
	println(product)
//	println(product.name)
	val product2 = product.copy("SuperMie")
	println(product2)

}