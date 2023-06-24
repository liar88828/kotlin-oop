import app.data.Company

fun main() {
	val company1 = Company("eko")
	val company2 = Company("eko")
	println(company1.hashCode())
	println(company2.hashCode())
	println(company1.hashCode() == company2.hashCode())
}