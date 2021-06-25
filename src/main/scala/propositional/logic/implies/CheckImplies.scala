package propositional.logic.implies

import Math.{PI,E}
import scala.math._
import propositional.logic.implies.Implies.extendedBoolean

object CheckImplies {

  def main(args:Array[String]): Unit ={

    println(s" (pow(PI,2)>2) implies (PI >1.4): ${((pow(PI,2)>2) implies (PI >1.4))}")
    println(s" (pow(PI,2)<0) implies (PI == 3): ${((pow(PI,2)<0) implies (PI == 3))}")
    println(s" (pow(PI,2)>0) implies ((1+2)==4): ${((pow(PI,2)>0) implies ((1+2)==4))}")
    println(s" (PI < pow(PI,2)) implies (PI == 5): ${((PI < pow(PI,2)) implies (PI == 5))}")
    println(s" (pow(E,2)>=0) implies (E < 0): ${((pow(E,2)>=0) implies (E < 0))}")


  }

}
