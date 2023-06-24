package data

class Person(
	firstNameParam: String,
	middleNameParam: String?,
	lastNameParam: String,
) {
	var firstName: String = firstNameParam
	var middleName: String? = middleNameParam
	var lastName: String = lastNameParam

	fun sayHello(name: String) {
		println("Hello $name, my name is $firstName")
	}

	fun run() {
		println("im run")
	}

	fun getFullName(): String {
		return "$firstName $middleName $lastName"

	}
}


