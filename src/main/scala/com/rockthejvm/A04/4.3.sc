val points = List((1, 3), (2, 5), (4, 8), (6, 2))

println(points.foldLeft((0.0, 0.0)) { case ((sumX, sumY), (x, y)) => (sumX + x, sumY + y) } match { case (sumX, sumY) => (sumX / points.length, sumY / points.length)})