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
        val fang = new Wolf("Fang")
        fang.moveSpeed = 36.0
        println(fang.move)
    }

}
