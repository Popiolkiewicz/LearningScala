/**
 *
 */
package pl.hubert.scala

/**
 * Created on 29 sie 2015 - 21:14:43
 *
 * @author Hubert
 */
trait BulletProof {
    def hitByBullet: String

    def ricochet(startSpeed: Double): String = {
        "The bullet ricochets at a speed of %.1f ft/sec".format(startSpeed * .75)
    }
}