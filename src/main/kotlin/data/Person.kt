package data

class Person(
//	firstNameParam: String,
//	middleNameParam: String?,
//	lastNameParam: String,
	var firstName: String = "",
	var middleName: String? = null,
	var lastName: String = "",
) {

	fun sayHello(name: String): Unit {
		println("Hello $name, my name is $firstName")
	}
	// boleh asalkan prameternya berbeda
//	fun sayHello(name: Int): Unit {
//		println("Hello $name, my name is $firstName")
//	}

	fun sayHello(firstName: String, lastName: String) {
		println("Hello $firstName $lastName, my name is ${this.firstName}	")
	}

	fun run() {
		println("im run")
	}

	fun getFullName(): String {
		return "$firstName $middleName $lastName"

	}
}


