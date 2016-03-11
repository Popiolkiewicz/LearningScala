/**
 *
 */
package pl.hubert.scala

/**
 * Created on 29 sie 2015 - 19:28:21
 *
 * @author Hubert
 */
class Animal(var name: String, var sound: String) {
    this.setName(name);

    protected val id = Animal.newIdNum;

    def getName(): String = {
        return name;
    }

    def getSound(): String = {
        return sound;
    }

    def getId(): Int = {
        id;
    }

    def setName(name: String) {
        if (!(name.matches(".*\\d+.*")))
            this.name = name;
        else
            this.name = "No Name";
    }

    def setSound(sound: String) {
        this.sound = sound;
    }

    def this(name: String) {
        this("No Name", "No Sound");
        this.setName(name);
    }

    def this() {
        this("No Name", "No Sound")
    }

    override def toString(): String = {
        return "%s with the id %d says %s".format(this.name, this.id, this.sound);
    }

}

object Animal {
    private var idNumber = 0;
    private def newIdNum(): Int = {
        idNumber += 1;
        idNumber;
    }
}
