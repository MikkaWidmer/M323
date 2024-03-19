import scala.util.Random

def multiplyWithRandom(number: Double, randomValue: Double): Double = {
  number * randomValue
}

def generateRandom: Double = Random.nextDouble()

val randomValue1 = generateRandom
val randomValue2 = generateRandom

println(multiplyWithRandom(5, randomValue1)) // Output: A random number between 0 and 5
println(multiplyWithRandom(10, randomValue2)) // Output: A random number between 0 and 10
