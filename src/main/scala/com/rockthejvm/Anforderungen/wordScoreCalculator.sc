class WordScoreCalculator(words: Array[String]) {
  val wordList = words
  case class Word(`word`: String, `score`: Int)


  def getSortedWordList(): Array[Word] = {
    val list = wordList.zipWithIndex.map { case (item, index) =>
      val score = item.replace("a", "").length
      Word(item, score)
    }

    list.sortBy(_.`score`).reverse
  }
}

val words = Array("apple", "banana", "grapdsdsae", "kiwi", "aaaaaaaaaaaaaaaa")
val calculator = new WordScoreCalculator(words)

val sortedWordList = calculator.getSortedWordList()
sortedWordList.foreach(word => println(s"Word: ${word.word}, Score: ${word.score}"))
