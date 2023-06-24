package app.app

import app.data.Company

fun main() {
	var company1 = Company("Eko")
	var company2 = Company("Eko")
	println(company1 == company2)
	println(company1 == company1)
	println(company2 == company2)
}