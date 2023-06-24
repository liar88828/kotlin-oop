package data

class Person {
	var firstName: String = ""
	var middleName: String? = null
	var lastName: String = ""
}


fun main() {
	val eko = Person()
	eko.firstName = "Eko"
	eko.middleName = "Kurniawan"
	eko.lastName = "Khannedy"

	println(eko.firstName)
}