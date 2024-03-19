def addToCart(cartItems: List[String], item: String): List[String] = {
  cartItems :+ item
}

val initialCartItems = List[String]()

println(addToCart(initialCartItems, "Apple"))   // Ausgabe: List(Apple)
