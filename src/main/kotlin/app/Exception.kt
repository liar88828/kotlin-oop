package app.app

import app.exception.ValidationException


fun validateAndSayHello(name: String) {
	if (name.isBlank()) throw ValidationException("Name is Blank")
	println("Hello $name")
}

fun main() {
	try {

		validateAndSayHello("Eko")
		validateAndSayHello("")
		println("Program success")
	} catch (e: ValidationException) {
		println("Error with message ${e.message}")
	} catch (e: Exception) {
		println("Error with message ${e.message}")
	} finally {
		println("Program selesai")
	}
}