import java.util

class TipCalculator(names: Array[String]) {
  val namesList: Array[String] = names

  def addPerson(name: String): TipCalculator = {
    new TipCalculator(namesList :+ name)
  }

  def getNames(): Array[String] = {
    for ((item, index) <- namesList.zipWithIndex) {
      println(s"Person ${index + 1}: ")
      println(s"  name: ${item}\n")
    }

    namesList
  }

  def getTipPercentage(): Int = {
    val tip = if (namesList.length > 5) 20 else if (namesList.length > 1) 10 else 0

    println(s"Your discount is ${tip}%")
    tip
  }
}

//val initialNames = Array("Person1", "Person2", "Person3", "Person4", "Person5")
val initialNames = Array[String]("Person1")
val tipCalculator = new TipCalculator(initialNames)
tipCalculator.getNames()
tipCalculator.getTipPercentage()

val updatedTipCalculator = tipCalculator.addPerson("Person6")
updatedTipCalculator.getNames()
updatedTipCalculator.getTipPercentage()
