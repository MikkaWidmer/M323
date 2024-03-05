package com.rockthejvm
object Aufgabe1 extends App {
  // Imperative Lösung
  def calculateScore(word: String) = {
    var score = 0
    for (c <- word.toCharArray) {
      if (c != 'a') {
        score += 1
      }
    }
    score
  }

  // Deklarative Lösung
  def wordScore(word: String) = word.filter(_ != 'a').length

  val word = "Stefan Laux"
  val score = calculateScore(word)
  val score2 = wordScore(word)
  println(s"Die Punktzahl von '$word' beträgt: $score")
  println(s"Die zweite Punktzahl von '$word' beträgt: $score2")
}
