package pl.hubert.scala

/**
 * Created on 29 sie 2015 - 20:56:03
 *
 * @author Hubert
 */
class Dog(name: String, sound: String, growl: String) extends Animal(name, sound) {
    def this(name: String, sound: String) {
        this("No Name", sound, "No Growl");
        this.setName(name);
    }

    def this(name: String) {
        this("No name", "No sound", "No growl");
        this.setName(name);
    }

    def this() {
        this("No name", "No sound", "No growl");
    }

    override def toString(): String = {
        return "%s with the id %d says %s or %s".format(this.name, this.id, this.sound, this.growl);
    }
}