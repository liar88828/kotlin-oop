package app.program

import app.annotation.Fancy
import app.app.a

@Fancy(author = "eko")
class Myapplication(val name: String, val version: Int) {
	fun info(): String = "Application $name $version"
}