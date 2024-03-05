package com.rockthejvm.A01

object TipCalculator {
  def calculateTip(groupSize: Int): Int = {
    groupSize match {
      case size if size > 5 => 20 // Trinkgeld von 20% für Gruppen mit mehr als 5 Personen
      case size if size > 0 => 10 // Trinkgeld von 10% für Gruppen mit 1-5 Personen
      case _ => 0 // Kein Trinkgeld, wenn keine Gruppe
    }
  }
}

object Main extends App {
  val tipPercentage1 = TipCalculator.calculateTip(3)
  println(s"Trinkgeld-Prozentsatz für eine Gruppe von 3 Personen: $tipPercentage1%")

  val tipPercentage2 = TipCalculator.calculateTip(7)
  println(s"Trinkgeld-Prozentsatz für eine Gruppe von 7 Personen: $tipPercentage2%")

  val tipPercentage3 = TipCalculator.calculateTip(0)
  println(s"Trinkgeld-Prozentsatz für keine Gruppe: $tipPercentage3%")
}
