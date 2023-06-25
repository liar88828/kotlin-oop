package app.data

import kotlin.properties.Delegates

class Account(description: String = "") {
	val name: String by lazy {
		println("lazy name is called")
		"Eko"
	}
//	val name: String = "Eko"


	var descripton: String by Delegates.observable(description)
	{ property, oldValue, newValue ->
		println("${property.name} is change from $oldValue and $newValue ")
	}

}