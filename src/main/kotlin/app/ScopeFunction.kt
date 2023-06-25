package app.app

import app.data.Student

fun main() {
	val student = Student("Eko", 15)
	println(student.name)
	println(student.age)

//val result=	student.let {
//		println(it.name)
//		println(it.age)
//		"Eko"
//	}
//	println(result)
	val result: String = student.let {
		"My name is ${it.name} my aga is ${it.age}"
	}
	println(result)

	val result2: String = student.run {
		"My name is ${this.name} my aga is ${this.age}"
	}
	println(result2)

	val result3: Student = student.apply {
		"My name is ${this.name} my aga is ${this.age}"
	}
	println(result3)

	val result4: Student = student.also {
		"My name is ${it.name} my aga is ${it.age}"
	}
	println(result4)

	val result5: String = with(student) {
		"My name is ${this.name} my aga is ${this.age}"
	}
	println(result5)

}