package app.app

import app.data.SuperTeacher
import app.data.Teacher

fun main() {
//	val teacher = Teacher("Eko")
	val teacher = SuperTeacher("Eko")
	println(teacher.name)
	teacher.test()
}