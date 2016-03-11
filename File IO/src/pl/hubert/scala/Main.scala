/**
 *
 */
package pl.hubert.scala
import scala.io.StdIn.{ readLine, readInt }
import scala.math._
import scala.collection.mutable.ArrayBuffer
import java.io.PrintWriter
import scala.io.Source
/**
 * Created on 29 sie 2015 - 19:28:21
 *
 * @author Hubert
 */
object Main {
    def main(args: Array[String]) {

        val writer = new PrintWriter("test.txt");
        writer.write("Just some randon text \n Some more random text");
        writer.close()

        val textFromFile = Source.fromFile("test.txt", "UTF-8");
        val lineIterator = textFromFile.getLines

        for (line <- lineIterator)
            println(line)

        textFromFile.close()
    }

}
