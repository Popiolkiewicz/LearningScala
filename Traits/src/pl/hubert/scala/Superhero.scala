/**
 *
 */
package pl.hubert.scala

/**
 * Created on 29 sie 2015 - 21:16:29
 *
 * @author Hubert
 */
class Superhero(val name: String) extends Flyable with BulletProof {

    def fly = {
        "%s flys through the air".format(this.name)
    }

    def hitByBullet = {
        "The bullet bounces of %s".format(this.name)
    }
}