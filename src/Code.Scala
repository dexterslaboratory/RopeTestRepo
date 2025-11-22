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

  def fibonacciImperative(n: Int): List[Int] = {
    if (n <= 0) return List.empty
    
    var result = new scala.collection.mutable.ListBuffer[Int]()
    var a = 0
    var b = 1
    var i = 0
    
    while (i < n) {
      result += a
      val next = a + b
      a = b
      b = next
      i += 1
    }
    
    return result.toList
  }

  
}