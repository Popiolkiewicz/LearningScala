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

        def divideNums(num1: Int, num2: Int) = try {
            (num1 / num2)
        }
        catch {
            case ex: ArithmeticException => "Can't divide"
        }
        finally {
            //clean up after exception
        }
    }

}
