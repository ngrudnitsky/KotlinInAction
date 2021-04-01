package chapter04.part02

class LengthCounter {
  var counter: Int = 0
    private set

  fun addWord(word: String) {
    counter += word.length
  }
}