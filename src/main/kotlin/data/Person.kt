package data

class Person(
//	firstNameParam: String,
//	middleNameParam: String?,
//	lastNameParam: String,
) {
	var firstName: String = "firstNameParam"
	var middleName: String? = "middleNameParam"
	var lastName: String = "lastNameParam"

	fun sayHello(name: String): Unit {
		println("Hello $name, my name is $firstName")
	}
	// boleh asalkan prameternya berbeda
//	fun sayHello(name: Int): Unit {
//		println("Hello $name, my name is $firstName")
//	}

	fun sayHello(firstNameParam: String, lastNameParam: String) {
		println("Hello $firstNameParam, my name is $lastNameParam")
	}

	fun run() {
		println("im run")
	}

	fun getFullName(): String {
		return "$firstName $middleName $lastName"

	}
}


