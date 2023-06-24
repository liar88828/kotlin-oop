package data

class Car(
	paramBrand: String,
	paramYear: Int = 2020
) {
	var brand: String = paramBrand
	var year: Int = paramYear

	// secara otomatis akan di jalankan meskipun tidak di panggil method nya
	init {
		println("$paramBrand telah di buat")
	}
}
