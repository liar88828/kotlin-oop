package app.data

interface Interaction {
	val name: String// = "Eko" // salah karena tidak boleh
	fun sayHello(name: String) = println("Hello $name, My name is ${this.name}")
}

interface Go : Interaction {
	fun go() {
		println("Go!")
	}
}

interface MoveA {
	fun move() = println("moveA")
}

interface MoveB {
	fun move() = println("moveB")
}

open class Contoh// boleh ada class
class Human(override val name: String) : Contoh(), MoveA, MoveB, Go//, Interaction
{
	override fun move() {
		super<MoveA>.move()
		super<MoveB>.move()
		println("Move Human")
	}

}