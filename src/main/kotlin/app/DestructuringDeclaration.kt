package app.app

import app.data.Game
import app.data.Login
import app.data.MinMax
import kotlin.math.log


fun minMax(value1: Int, value2: Int): MinMax {
	return when {
		value1 > value2 -> MinMax(value1, value2)
		else -> MinMax(value2, value1)
	}
}

fun main() {

	val game = Game("Game Kotlin", 1000)
	println(game.name)
	println(game.price)
	val (name, price) = game
	println(name)
	println(price)

	val result = minMax(10, 100)
	println(result.min)
	println(result.max)
	val (min, _) = result
	println(min)

	val logins = Login("eko", "rahasia")
//	login(login) { login ->
//		login.username == "eko" && login.password == "rahasia"
//	}

	val log = login(logins) { (username, password) ->
		username == "eko" && password == "rahasia"
	}
	println(log)
}

fun login(
	login: Login,
	callback: (Login) -> Boolean
): Boolean {
	return callback(login)
}