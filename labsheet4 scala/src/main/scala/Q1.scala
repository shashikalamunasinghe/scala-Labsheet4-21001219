object Q1 {
  def main(args: Array[String]): Unit = {

    println("Enter the deposit Amount:")
    var amount = scala.io.StdIn.readDouble()
    println(s"The interest of the year = ${interest(amount)}")

  }
  def interest(depositAmount :Double):Double = depositAmount match{
    case x if x<0 => 0
    case x if x< 20000 => x *.02
    case x if x< 200000 => x *.04
    case x if x< 2000000 => x *.35
    case x if x >= 2000000 => x *.65
  }

}