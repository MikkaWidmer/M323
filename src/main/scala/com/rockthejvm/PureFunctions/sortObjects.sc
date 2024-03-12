case class Object(date: String, priority: Int, title: String)

def sortByCustomCriteria(objects: List[Object]): List[Object] = {
  objects.sortBy(obj => (obj.date, obj.priority, obj.title))
}

val object1 = Object("2023-02-20", 2, "TitleA")
val object2 = Object("2023-02-21", 1, "TitleB")
val object3 = Object("2023-02-20", 1, "TitleC")

val objectList = List(object1, object2, object3)

val sortedList = sortByCustomCriteria(objectList)

println(sortedList)