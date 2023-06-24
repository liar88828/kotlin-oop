package app.app

import data.Address

fun main() {
	val address = Address("Jalan A", "Jakarta")
	val address2 = Address("Jalan b", "Bandung", "Indonesia")
	println(address.street)
	println(address2.street)
}