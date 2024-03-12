case class CartItem(title: String, `type`: String)

var cart: Array[CartItem] = Array(CartItem("book1", "w"), CartItem("pen1", "pen"))
var discount = 0

def printCartItems(): Unit = {

  for ((item, index) <- cart.zipWithIndex) {
    println(s"Item ${index + 1}: ")
    println(s"  title: ${item.title},")
    println(s"  type: ${item.`type`} \n")

    if(item.`type`.equals("book")) {
      discount = 5
    }
  }

  println(s"Your discount is ${discount}% \n")
}

def addCartItem(item: CartItem): Unit = {
  if (!item.title.equals(null) & !item.`type`.equals(null)) {
    cart = cart :+ item
  }
}

printCartItems()
addCartItem(CartItem("d", "book"))
printCartItems()

def calculateDiscount(cart: Array[CartItem]) = {
  if (cart.exists(item => item.`type` == "book")) {
    println(s"Your discount is 5%")
  } else {
    println(s"Your discount is 0%")
  }
}

calculateDiscount(Array(CartItem("name", "book"), CartItem("nichtBuch", "a")))


