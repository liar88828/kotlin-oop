package app.app

import app.data.Gender

fun main() {
	val man = Gender.MALE
	val woman = Gender.FEMALE
	Gender.MALE
	val allGender: Array<Gender> = Gender.values()

	val manOfString = Gender.valueOf("MALE")
	val womanOfString = Gender.valueOf("FEMALE")


	println(man)
	println(woman)
	println()
	println(allGender)
	println(allGender.toList())
	println(allGender.toList()[0])
	println(allGender.toList()[1])
	println()
	println(manOfString)
	println(womanOfString)
	println()
	man.showDescription()
	woman.showDescription()
}