package propositional.logic.implies

object Implies {

  implicit def extendedBoolean(a: Boolean) = new {
    def implies(b: => Boolean) = {!a||b}
  }

}
