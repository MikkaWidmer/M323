case class Adresse(strasse: String, hausnummer: Int, postleitzahl: String, stadt: String)

val adressen = List(
  Adresse("Hauptstrasse", 10, "12345", "Musterstadt"),
  Adresse("Nebenstrasse", 5, "23456", "Beispielburg")
)


println(adressen.map((adress: Adresse) => {
  val modifiedHausnummer = adress.hausnummer.toString + ","
  List(adress.strasse, modifiedHausnummer, adress.postleitzahl, adress.stadt).mkString(" ")
}).mkString("\n"))