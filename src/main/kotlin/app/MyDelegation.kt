package app.app

import app.data.BaseMyDelegation
import app.data.DelegationBase
import app.data.MyBase

fun main() {

	val base = MyBase()
	base.sayHello("Eko")

	val myDelegation = BaseMyDelegation(base)
	myDelegation.sayHello("Eko")

	val delegation = DelegationBase(base)
	delegation.SayGoodBye("Budi")
	delegation.sayHello("Joko")

}