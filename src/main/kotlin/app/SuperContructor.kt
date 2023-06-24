package app.app

import app.data.ExecutiveCustomers
import app.data.PremiumCustomers

fun main() {
	val premiumCustomers = PremiumCustomers("Budi")
	println(premiumCustomers.name)
	val executiveCustomers = ExecutiveCustomers("Eko", 100000)
	println(executiveCustomers.name)
	println(executiveCustomers.balance)
}