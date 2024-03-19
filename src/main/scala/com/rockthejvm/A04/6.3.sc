val colors = List("Red", "Green", "Blue")
val fruits = List("Apple", "Banana", "Orange")

for {
  color <- colors
  fruit <- fruits
} yield (color, fruit)