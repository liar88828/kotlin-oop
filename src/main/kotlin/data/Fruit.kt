package app.data

class Fruit(val quantity: Int) {
	//	fun plus(fruit: Fruit): Fruit {
//		return Fruit(this.quantity + fruit.quantity)
//	}
	operator fun plus(fruit: Fruit): Fruit {
		return Fruit(this.quantity + fruit.quantity)
	}

	operator fun minus(fruit: Fruit): Fruit {
		return Fruit(this.quantity - fruit.quantity)
	}

}