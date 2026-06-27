object ReverseString:
  def reverse(str: String): String =
    (for x <- str.reverseIterator yield x).mkString
