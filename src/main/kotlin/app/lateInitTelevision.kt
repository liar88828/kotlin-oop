package app.app

import data.Television

fun main() {
	val ty = Television()
//	println(ty.brand)
	ty.brand = "TLC"
	println(ty.brand)
	ty.initTelevision("Samsung")
	println(ty.brand)

}