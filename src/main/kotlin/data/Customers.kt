package app.data

open class Customers(val name: String, val type: String, val balance: Long) {
	constructor(name: String, type: String) : this(name, type, 0)
	constructor(name: String) : this(name, "Standard")
}

class PremiumCustomers : Customers {
	constructor(name: String) : super(name, "Premium")
	constructor(name: String, balance: Long) : super(name, "Premium", balance)
}

class ExecutiveCustomers(name: String, balance: Long) : Customers(name, "Executive", balance) {
	constructor(name: String) : this(name, 0)
}