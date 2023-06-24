package data

class Car(
	paramBrand: String,
	paramName: String,
	paramYear: Int = 2020
) {

	constructor(paramBrand: String, paramName: String) :
	 this(paramBrand, paramName, 2020) {
		println("secondary constructor 1")
	}

	constructor(paramBrand: String) : this(paramBrand, "") {
		println("secondary constructor 2")
	}

	var brand: String = paramBrand
	var name: String = paramName
	var year: Int = paramYear

	// secara otomatis akan di jalankan meskipun tidak di panggil method nya
	init {
		println("$paramBrand telah di buat")
	}
}
