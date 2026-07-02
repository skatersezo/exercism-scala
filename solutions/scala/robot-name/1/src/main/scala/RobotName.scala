
object RobotName:
  private val _allNames: LazyList[String] =
    for
      a <- LazyList(('A' to 'Z').toList).flatten
      b <- LazyList(('A' to 'Z').toList).flatten
      c <- LazyList((0 to 9).toList).flatten
      d <- LazyList((0 to 9).toList).flatten
      e <- LazyList((0 to 9).toList).flatten
    yield s"$a$b$c$d$e"

  private val _itr = _allNames.iterator
  def getName: String = _itr.next()

class Robot:
  private var _name: String = RobotName.getName
  def name: String = _name

  def reset(): Unit =
    _name = RobotName.getName