def calculateSum(list: List[Int]): Int = {
  list.sum
}

val numbers = List(1, 2, 3, 4, 5)
println(calculateSum(numbers))

def sumList(numbers: List[Int]): Int = {
  numbers match {
    case Nil => 0 // Basisfall: Wenn die Liste leer ist, ist die Summe 0
    case head :: tail => head + sumList(tail) // Rekursiver Aufruf: Addiere das erste Element zur Summe der restlichen Elemente
  }
}

// Beispielaufruf
val numbers = List(1, 2, 3, 4, 5)
println(sumList(numbers)) // Ausgabe: 15 (1 + 2 + 3 + 4 + 5)
