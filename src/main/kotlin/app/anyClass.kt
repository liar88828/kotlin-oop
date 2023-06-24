import app.data.SmartPhone

fun main() {
	val smartPhone = SmartPhone("Samsung 10", "Android")
	println(smartPhone.toString())
	println(smartPhone.hashCode())
}