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

        // _ means smth like "every argument taken"
        val log10Func = log10 _

        //1
        println(log10Func(1000))

        //2
        //LIKE THAT
        val myList = List[Double](1000.0, 10000.0);
        val myListWithFunctionMapped = myList.map(log10Func) //Mapping function to map elements
        myListWithFunctionMapped.foreach(println)
        println()

        //OR LIKE THAT
        List(1000.0, 10000.0).map(log10Func).foreach(println)
        println()

        //3
        List(1, 2, 3, 4, 5).map((x: Int) => x * 50).foreach(println)
        println()

        //4
        //Underdash means the same as (x:Int) in this case
        List(1, 2, 3, 4, 5).filter(_ % 2 == 0).foreach(println)
        println()

    }

}
