package app.data

//enum class Gender {
//	MALE,FEMALE
//}
enum class Gender(val description: String) {
	MALE(description = "male"), FEMALE("female");

	fun showDescription() = println(description)
}