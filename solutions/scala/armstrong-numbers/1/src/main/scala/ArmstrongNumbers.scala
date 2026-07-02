
object ArmstrongNumbers:
  def isArmstrongNumber(num: Int): Boolean =
    val str = num.toString
    str.map(_.asDigit.toDouble).map(math.pow(_, str.length)).sum.toInt == num
