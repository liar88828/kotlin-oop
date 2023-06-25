package app.app

import app.data.Token

fun main() {
	val token = Token("Ini token")
	println(token.value)
	println(token.toUpper())
}