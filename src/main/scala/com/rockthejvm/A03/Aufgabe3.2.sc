def meanList(numbers: List[Double]): Double = {
  def sumList(numbers: List[Double]): Double = numbers match {
    case Nil => 0.0
    case head :: tail => head + sumList(tail)
  }

  def countElements(numbers: List[Double]): Int = numbers match {
    case Nil => 0
    case _ :: tail => 1 + countElements(tail)
  }

  sumList(numbers) / countElements(numbers)
}

// Beispielaufruf
val numbers = List(1.0, 2.0, 3.0, 4.0, 5.0)
println(meanList(numbers)) // Ausgabe: 3.0 (Mittelwert von 1.0, 2.0, 3.0, 4.0, 5.0)
