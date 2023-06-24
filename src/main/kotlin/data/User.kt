package app.data

class User(
	var username: String,
	val password: String
) {
//	langsung tanpa di panggil
override fun toString(): String {
	return "User with username = $username"
}
//	var username: String = usernameParam
//	var password: String = passwordParam
}