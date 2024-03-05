package com.rockthejvm

object Aufgabe2 extends App {
  class ShoppingCart(items: List[String]) {
    def getDiscountPercentage: Int = {
      if (items.exists(_.toLowerCase.contains("buch"))) {
        5
      } else {
        0
      }
    }

    def addItem(item: String): ShoppingCart = new ShoppingCart(item :: items)

    def removeItem(item: String): ShoppingCart = new ShoppingCart(items.filterNot(_ == item))

    def getItems: List[String] = items
  }

  val cart = new ShoppingCart(List("Apfel", "Buch", "Banane"))
  println(s"Warenkorb: ${cart.getItems}")
  println(s"Rabatt: ${cart.getDiscountPercentage}%")

  val updatedCart = cart.removeItem("Buch")
  println(s"Neuer Warenkorb: ${updatedCart.getItems}")
  println(s"Rabatt: ${updatedCart.getDiscountPercentage}%")
}
