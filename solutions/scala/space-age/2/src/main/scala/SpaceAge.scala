object SpaceAge:
  def onEarth(age: Double): Double = secToYear(age)

  def onVenus(age: Double): Double = secToYear(age) / 0.61519726

  def onMercury(age: Double): Double = secToYear(age) / 0.2408467

  def onMars(age: Double): Double = secToYear(age) / 1.8808158

  def onJupiter(age: Double): Double = secToYear(age) / 11.862615

  def onSaturn(age: Double): Double = secToYear(age) / 29.447498

  def onUranus(age: Double): Double = secToYear(age) / 84.016846

  def onNeptune(age: Double): Double = secToYear(age) / 164.79132

  private def secToYear(sec: Double): Double = sec / 31_557_600

