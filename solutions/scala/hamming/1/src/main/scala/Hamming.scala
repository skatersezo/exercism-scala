object Hamming:
  def distance(dnaStrandOne: String, dnaStrandTwo: String): Option[Int] =
    dnaStrandOne.length match 
      case none if none != dnaStrandTwo.length => None
      case _ => Some(dnaStrandOne.zip(dnaStrandTwo).count((a,b) => a != b))