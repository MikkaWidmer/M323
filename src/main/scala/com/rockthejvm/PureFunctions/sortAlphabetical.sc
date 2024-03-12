def sortAlphabetically(list: List[String]): List[String] = {
  list.sorted
}

val letters = List("a", "b", "c", "e", "d")
println(sortAlphabetically(letters))