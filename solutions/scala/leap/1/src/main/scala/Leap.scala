object Leap:
  def leapYear(year: Int): Boolean =
    year match
      case leap if year % 4 == 0 =>
        if year % 100 == 0 && year % 400 != 0 then false
        else true
      case _ => false