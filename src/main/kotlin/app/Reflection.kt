package app.app

import app.annotation.NotBlank
import app.data.CreateCategoryRequest
import app.data.CreateProductRequest
import app.exception.ValidationException


//fun vali{dateRequest(request: CreateCategoryRequest) {
//	if (request.id == "") throw ValidationException("Id is blank")
//	if (request.name == "") throw ValidationException("Name is blank")
//}
//
//fun validateRequest(request: CreateProductRequest) {
//	if (request.id == "") throw ValidationException("Id is blank")
//	if (request.name == "") throw ValidationException("Name is blank")
//}
//-------}

fun validateRequest(request: Any) {
	val clazz = request::class
//	val properties = clazz.java.declaredFields.toList()
//		membersProperty
	val properties = clazz.findA

	// iterate satu satu kalau ada annotation blank
	for (p in properties) {
		when (val value: Any? = p.) {
			is String -> if ("" == value) throw ValidationException("${p.name} is blank")
		}
	}
}

fun main() {
	val request = CreateProductRequest("1", "Indomie", 2000)
	println(request)
}