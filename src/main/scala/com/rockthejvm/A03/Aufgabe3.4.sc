case class MyObject(date: String, priority: Int, title: String)

def customSort(objects: List[MyObject]): List[MyObject] = {
  objects.sortBy(obj => (obj.date, obj.priority, obj.title))
}

// Beispielaufruf
val objects = List(
  MyObject("2024-03-19", 2, "Object 1"),
  MyObject("2024-03-20", 1, "Object 2"),
  MyObject("2024-03-18", 3, "Object 3")
)

val sortedObjects = customSort(objects)
sortedObjects.foreach(obj => println(s"Date: ${obj.date}, Priority: ${obj.priority}, Title: ${obj.title}"))
