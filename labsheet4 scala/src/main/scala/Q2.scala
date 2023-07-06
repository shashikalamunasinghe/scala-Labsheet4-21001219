object Q2 {
  def main(args: Array[String]): Unit = {
    if (args.length > 0) {
      val input = args(0).toInt
      val result = patternMatching(input)
      println(result)
    } else {
      println("not provided any number")
    }
  }

  def patternMatching(num: Int): String = num match {
    case x if x <= 0 => "Negative/Zero is input"
    case x if x % 2 == 0 => "Even number is given"
    case _ => "Odd number is given"
  }

}
