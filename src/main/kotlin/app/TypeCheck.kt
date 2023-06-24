package app.app

import app.data.HandPhone
import app.data.Laptop

fun printObject(any: Any) {
	if (any is Laptop) println("Laptop ${any.name}")
	else if (any is HandPhone) println("SmartPhone ${any.name}")
	else println(any)
}

fun printObjectWhen(any: Any) {
	when (any) {
		is Laptop -> println("Laptop ${any.name}")
		is HandPhone -> println("SmartPhone ${any.name}")
		else -> println(any)
	}
}

fun printString(any: Any) = println(any as String)
fun printString2(any: Any) = println(any as? String)
fun main() {
	printObject("Eko")
	printObject(1)
	printObject(Laptop("Acer"))
	printObject(HandPhone("Samsung"))
	println()
	printObjectWhen("Budi")
	printObjectWhen(2)
	printObjectWhen(Laptop("Dell"))
	printObjectWhen(HandPhone("Lenovo"))

	printString("eko")
	printString2(1)

}