package app.app

import app.data.BigNote
import app.data.Note

fun main() {
	val note = Note("Belajar Kotlin")
	println(note.title)
	note.title = ""
	println(note.title)
	println()
	val bigNote = BigNote("Belajar Kotlin")
	println(bigNote.title)
	println(bigNote.bigTitle)

}