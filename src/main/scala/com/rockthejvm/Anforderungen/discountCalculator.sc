def discountCalculator(num: Double): Array[Double] = {
  Array(num * 95 / 100, num / 20)
}

val num = 90.0
println("Your initial price was: " + num + ". You saved " + discountCalculator(num)(1) + " with your 5% discount and your new discounted price is: " + discountCalculator(num)(0) + ".")