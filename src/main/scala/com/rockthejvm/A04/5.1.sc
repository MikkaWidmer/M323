var values = List(List(1, 2), List(3, 4), List(5, 6))

println(values.flatMap(_.map(_ * 2)))
println(values.flatten.map(_ * 2))