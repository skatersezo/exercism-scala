object Hamming:
  def distance(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] =
    countMismatches(dnaStrandOne.toList, dnaStrandTwo.toList)

  private def countMismatches(a: List[Char], b: List[Char]): Option[Int] =
    (a, b) match
      case (Nil, Nil) => Some(0)
      case (x :: xs, y :: ys) => countMismatches(xs, ys).map(r => r + (if x != y then 1 else 0))
      case _ => None
