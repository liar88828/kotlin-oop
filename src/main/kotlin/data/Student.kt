package app.data

class Student(val name: String, val age: Int)


fun Student?.sayHello(name: String) {
	if (this != null || name != "") println("Hello $name, my name is ${this?.name}, and my age is ${this?.age}")

}

val Student.upperName: String
	get() = this.name.uppercase()