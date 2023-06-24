package app.app

import app.data.User

class PropertyContructor {
}

fun main() {
	val user1 = User("eko", "rahasia")
	val user2 = User("joko", "rahasia")
	user1.username = "user1"
	println(user1.username)
	println(user2.username)
}