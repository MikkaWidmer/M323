case class Mitarbeiter(name: String, abteilung: String, gehalt: Int)

val mitarbeiter = List(
  Mitarbeiter("Max Mustermann", "IT", 50000),
  Mitarbeiter("Erika Musterfrau", "Marketing", 45000),
  Mitarbeiter("Klaus Klein", "IT", 55000),
  Mitarbeiter("Julia Gross", "HR", 40000)
)


println(mitarbeiter.filter(_.abteilung == "IT").filter(_.gehalt >= 50000).map(_.name.toUpperCase.split(" ").head))