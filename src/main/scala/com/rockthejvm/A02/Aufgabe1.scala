package com.rockthejvm.A02
object RabattBerechnung {
  def rabattierterPreis(preis: Double): Double = preis * 95 / 100
}

object Main extends App {
  val preis = 100.0
  val rabattierterPreis = RabattBerechnung.rabattierterPreis(preis)
  println(s"Der rabattierte Preis beträgt: $rabattierterPreis")
}
