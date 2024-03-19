var values = List("Hallo", " ", "Welt", "!")

println(values.foldLeft("")(_ + _))