/**
 *
 */
package pl.hubert.scala

/**
 * Created on 29 sie 2015 - 19:28:21
 *
 * @author Hubert
 */
object Main {
    def main(args: Array[String]) {
        val superman = new Superhero("Superman")
        println(superman.fly)
        println(superman.hitByBullet)
        println(superman.ricochet(2500))
    }

}
