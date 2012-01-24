package chapter7

class Director(builder:Builder) {

  def construct() = {
    builder.makeTitle("ナ・バ・テア")
    builder.makeString("None But Air")
    builder.makeItems(List("glide", "loop"))
    builder.makeString("息を止めて、一瞬の死が、弾を解き放つ")
    builder.makeItems(List("stall", "turn"))
    builder.close()
  }
}