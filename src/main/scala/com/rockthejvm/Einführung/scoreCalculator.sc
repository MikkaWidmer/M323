def calculateScore(word: String) = {
  var score = 0
  for (c <- word.toCharArray) {
    if (!c.toString.equals("a")) score += 1
  }
  score
}

def wordScore(word: String): Int = word.replace("a", "").length

calculateScore("imperative") == 9
calculateScore("no") == 2
wordScore("declarative") == 9
wordScore("yes") == 3