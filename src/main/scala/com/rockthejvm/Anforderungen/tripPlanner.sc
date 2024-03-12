class TripPlanner(destinations: Array[String]) {
  val destinationList: Array[String] = destinations

  def addDestination(destination: String): TripPlanner = {
    new TripPlanner(destinationList :+ destination)
  }

  def getDestinations(): Array[String] = {
    destinationList
  }
}

val initialTrip = Array[String]("Germany", "England")
val tripPlanner = new TripPlanner(initialTrip)
val initialDestinationList = tripPlanner.getDestinations()
for ((item, index) <- initialDestinationList.zipWithIndex) {
  if (index == 0) println("Start Destination: ")
  else if (index == initialDestinationList.length - 1) println("End Destination: ")
  else println(s"Between stay ${index}: ")
  println(s"  Location: ${item}\n")
}

val updatedTripPlanner = tripPlanner.addDestination("Switzerland")
val destinationList = updatedTripPlanner.getDestinations()
for ((item, index) <- destinationList.zipWithIndex) {
  if (index == 0) println("Start Destination: ")
  else if (index == destinationList.length - 1) println("End Destination: ")
  else println(s"Between stay ${index}: ")
  println(s"  Location: ${item}\n")
}