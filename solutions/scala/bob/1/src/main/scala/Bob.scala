object Bob:
  def response(statement: String): String =
    statement match
      case silence if statement.isBlank => "Fine. Be that way!"
      case questionWithoutLetters if statement.forall(!_.isLetter) && statement.trim.last == '?' => "Sure."
      case yelledQuestion if statement.contains('?') && statement.forall(!_.isLower)
        => "Calm down, I know what I'm doing!"
      case question if statement.trim.last == '?' => "Sure."
      case noLetters if statement.forall(!_.isLetter) => "Whatever."
      case shout if statement.forall(!_.isLower) => "Whoa, chill out!"
      case _ => "Whatever."


