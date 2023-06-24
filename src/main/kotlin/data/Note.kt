package app.data

class Note(title: String) {
	var title: String = title
		//		get() = field
		get() {
			println("Getter function")
			return field
		}
		//		set(value) {
//			field = value
//		}
		set(value) {
			if (value.isNotBlank()) {
				println("Setter function")
				field = value
			}
		}
}


class BigNote(val title: String) {
	val bigTitle: String
		get() = title.uppercase()
}