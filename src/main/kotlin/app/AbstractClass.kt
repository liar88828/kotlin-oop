import app.data.City
import app.data.Location

fun main() {
//	val location = Location("Semarang")//error karena Abstract
	val city = City("Semarang")
	println(city.name)
}