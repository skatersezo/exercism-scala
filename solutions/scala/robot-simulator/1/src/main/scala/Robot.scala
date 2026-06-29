import Bearing.*

case class Robot(bearing: Bearing, coordinates: (Int, Int)):
  def turnRight: Robot = copy(bearing = bearing.turnRight)
  def turnLeft: Robot = copy(bearing = bearing.turnLeft)
  
  def advance: Robot =
    val (x, y) = coordinates
    val newPosition = bearing match
      case North => (x, y + 1)
      case South => (x, y - 1)
      case East => (x + 1, y)
      case West => (x - 1, y)
    copy(coordinates = newPosition)
