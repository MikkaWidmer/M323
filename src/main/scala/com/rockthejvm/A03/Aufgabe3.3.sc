def sortStrings(strings: List[String]): List[String] = {
  def merge(left: List[String], right: List[String]): List[String] = (left, right) match {
    case (Nil, _) => right
    case (_, Nil) => left
    case (leftHead :: leftTail, rightHead :: rightTail) =>
      if (leftHead < rightHead) leftHead :: merge(leftTail, right)
      else rightHead :: merge(left, rightTail)
  }

  val n = strings.length / 2
  if (n == 0) strings
  else {
    val (left, right) = strings.splitAt(n)
    merge(sortStrings(left), sortStrings(right))
  }
}

// Beispielaufruf
val strings = List("banana", "apple", "orange", "grape")
println(sortStrings(strings)) // Ausgabe: List(apple, banana, grape, orange)
