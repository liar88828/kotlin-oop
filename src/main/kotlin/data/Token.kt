package app.data

inline class Token(val value: String) {
	fun toUpper(): String = value.uppercase()

}