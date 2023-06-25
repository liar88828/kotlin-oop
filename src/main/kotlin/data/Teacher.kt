package app.data

open class Teacher(val name: String) {
	private fun teach() = println("Teach !")

	//	private fun test() = println("Test")
	open protected fun test() = println("Test")
}

class SuperTeacher(name: String) : Teacher(name) {
	//	fun test() = println("Test")
	override public fun test() = super.test()

}