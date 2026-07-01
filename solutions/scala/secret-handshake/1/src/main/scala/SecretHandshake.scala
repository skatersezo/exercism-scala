
object SecretHandshake:
  def commands(num: Int): List[String] =
    val actions = List("wink", "double blink", "close your eyes", "jump")
    val bin = num.toBinaryString.reverse.padTo(5, '0')
    
    val handshake = actions.zipWithIndex.collect {
      case (action, i) if bin(i) == '1' => action
    }
    
    if bin(4) == '1' then handshake.reverse else handshake