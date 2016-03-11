/**
 *
 */
package pl.hubert.scala

import scala.math._
/**
 * Created on 29 sie 2015 - 19:28:21
 *
 * @author Hubert
 */
object Main {
    def main(args: Array[String]) {
        val log10Func = log10 _

        //Declaring two different functions
        def times3(num: Int) = num * 3
        def times4(num: Int) = num * 4

        //Declaring function which takes other function and Int as arguments
        def multIt(func: (Int) => Double, num: Int) = {
            func(num)
        }

        printf("3 * 100 = %.1f\n", multIt(times4, 100))

    }

}
