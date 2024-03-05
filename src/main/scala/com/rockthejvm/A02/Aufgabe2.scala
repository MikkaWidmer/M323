package com.rockthejvm.A02
object ReisePlaner {
  // Funktion zum Eingeben der Reiseziele
  def inputDestinations(destinations: List[String]): Unit = {
    println("Bitte geben Sie die Reiseziele ein:")
    destinations.foreach(println)
  }

  // Funktion zum Ändern der Route
  def changeRoute(currentRoute: List[String]): List[String] = {
    println("Aktuelle Route:")
    currentRoute.foreach(println)

    println("Möchten Sie die Route ändern? (Ja/Nein)")
    val choice = scala.io.StdIn.readLine()

    if (choice.equalsIgnoreCase("Ja")) {
      println("Bitte geben Sie die neue Route ein:")
      val newRoute = scala.io.StdIn.readLine().split(",").map(_.trim).toList
      newRoute
    } else {
      currentRoute
    }
  }

  def main(args: Array[String]): Unit = {
    val currentRoute = List("Berlin", "Prag", "Wien", "Budapest")
    val updatedRoute = changeRoute(currentRoute)
    println("Aktualisierte Route:")
    updatedRoute.foreach(println)
  }
}
