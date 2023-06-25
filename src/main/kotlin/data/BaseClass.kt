package app.data

import javax.lang.model.element.Name

interface BaseInter {
	fun sayHello(name: String)
	fun SayGoodBye(name: String)
}

class MyBase : BaseInter {
	override fun sayHello(name: String) = println("Hello $name")
	override fun SayGoodBye(name: String) = println("Good Bye ${name}")
}

class BaseMyDelegation(val base: BaseInter) : BaseInter {
	override fun sayHello(name: String) {
		base.sayHello(name)
	}

	override fun SayGoodBye(name: String) {
		TODO("Not yet implemented")
	}
}

class DelegationBase(val base: BaseInter) : BaseInter by base {
	fun SayGoodMorning(name: String) {
		TODO("Not yet implemented")
	}
}