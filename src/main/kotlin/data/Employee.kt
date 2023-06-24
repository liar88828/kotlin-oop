package app.data

open class Employee(val name: String) {
	open fun sayHello(name: String) {
		println("Hello $name, My name is ${this.name}")
	}
}

open class Manager(name: String) : Employee(name) {
	final override fun sayHello(name: String) {
		println("Hello $name, My name is manager ${this.name}")
	}
}

class SuperManager(name: String) : Manager(name) {

	// tidak bisa di override karena parentnya final
//	override fun sayHello(name: String) {
//			println("Hello $name, My name is Super Manager ${this.name}")
//	}
}

class VicePresident(name: String) : Employee(name) {
	override fun sayHello(name: String) {
		println("Hello $name, My name is vicePresident ${this.name}")
	}
}