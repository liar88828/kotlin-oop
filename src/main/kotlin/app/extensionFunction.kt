package app.app

import app.data.Student
import app.data.sayHello
import app.data.upperName

fun main() {
	val student: Student? = Student("Eko", 30)
	println(student?.age)
	student.sayHello("Budi")
	println(student?.upperName)
}