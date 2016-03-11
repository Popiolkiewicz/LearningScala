package pl.hubert.scala

/**
 * Created on 29 sie 2015 - 21:07:28
 *
 * @author Hubert
 */
class Wolf(override val name: String) extends Mammal(name) {
    var moveSpeed = 35.0;

    def move = "The wolf %s runs %.2f mph".format(this.name, this.moveSpeed);

}