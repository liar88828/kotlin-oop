package app.data

// sifatnya sama apa bila di ubah value maka akan berdampak pada value lainnya
object Utilities {
	var name: String = "My Utilities"
	fun toUpper(value: String): String = value.uppercase()

}