import scala.collection.SortedMap

class School:
  type DB = Map[Int, Seq[String]]

  private var gradesDb: DB = Map.empty

  def add(name: String, g: Int): Unit =
    val existing = gradesDb.getOrElse(g, Seq.empty)
    gradesDb = gradesDb + (g -> (existing :+ name))

  def db: DB = gradesDb

  def grade(g: Int): Seq[String] = gradesDb.getOrElse(g, Seq.empty)

  def sorted: DB = Map.from(SortedMap.from(gradesDb.map((grade, names) => grade -> names.sorted)))

