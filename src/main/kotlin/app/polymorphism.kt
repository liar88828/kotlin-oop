package app.app

import app.data.Employee
import app.data.Manager
import app.data.VicePresident

fun main() {
	var employee = Employee("Eko")
	employee.sayHello("Budi")

	employee = Manager("Eko")
	employee.sayHello("Budi")

	employee = VicePresident("Eko")
	employee.sayHello("Budi")

}