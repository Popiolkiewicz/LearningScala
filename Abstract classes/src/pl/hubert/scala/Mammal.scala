/**
 *
 */
package pl.hubert.scala

/**
 * Created on 29 sie 2015 - 21:06:54
 *
 * @author Hubert
 */
abstract class Mammal(val name: String) {
    var moveSpeed: Double;

    def move: String
}