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

        val rover = new Animal();
        rover.setName("Rover");
        rover.setSound("Woof");
        printf("%s says %s\n", rover.getName, rover.getSound);

        val whiskers = new Animal("Whiskers", "Meow")
        println(s"${whiskers.getName} with id ${whiskers.getId} says ${whiskers.getSound}")
        println(whiskers.toString)

        val spike = new Dog("Spike", "Woof", "Grrrr")
        spike.setName("Spike");
        println(spike.toString)
    }

}
