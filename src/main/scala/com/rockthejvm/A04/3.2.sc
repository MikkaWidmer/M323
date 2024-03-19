val kurse = List(
  "Programmierung in Scala",
  "Datenbanken",
  "Webentwicklung mit JavaScript",
  "Algorithmen und Datenstrukturen"
)

println(kurse.filter(_.contains("Daten")))
println(kurse.map(_.replaceAll(" ","")))
println(kurse.sorted)
println(kurse.sorted.reverse)