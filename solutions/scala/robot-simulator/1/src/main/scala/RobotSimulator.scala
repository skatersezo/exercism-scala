
extension (r: Robot)
  def simulate(commands: String): Robot =
    commands.foldLeft(r)((r, c) => c match {
      case 'L' => r.turnLeft
      case 'A' => r.advance
      case 'R' => r.turnRight
    })

enum Bearing:
  case North, South, East, West

  def turnRight: Bearing =
    this match
      case North => East
      case South => West
      case East => South
      case West => North

  def turnLeft: Bearing =
    this match
      case North => West
      case South => East
      case East => North
      case West => South
        
          