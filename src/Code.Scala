object Code {
  var globalState = 0 

  def doSomething(x: Int): Int = {
    val y = x + 1
    globalState = y 
    return y 
  }

  def fibonacci(n: Int): List[Int] = {
    @annotation.tailrec
    def go(k: Int, a: Int, b: Int, acc: List[Int]): List[Int] = {
      if (k == 0) acc.reverse
      else go(k - 1, b, a + b, a :: acc)
    }

    if (n <= 0) List.empty
    else go(n, 0, 1, List.empty)
  }
}