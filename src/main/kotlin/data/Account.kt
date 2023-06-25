package app.data

class Account {
	val name: String by lazy {
		println("lazy name is called")
		"Eko"
	}
//	val name: String = "Eko"
}