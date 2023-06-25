package app.app

import app.data.Student
import app.data.sayHello

fun main() {
	val student = Student("Eko", 30)
	println(student.age)
	student.sayHello("Budi")
}