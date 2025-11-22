object Code {
  var globalState = 0 // Mutable state!

  def doSomething(x: Int): Int = {
    val y = x + 1
    globalState = y // Side effect!
    return y // Explicit return!
  }
}