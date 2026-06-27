object Etl:
  def transform(scoreMap: Map[Int, Seq[String]]): Map[String, Int] =
    scoreMap.flatMap((s , l) => l.map(_.toLowerCase -> s))
