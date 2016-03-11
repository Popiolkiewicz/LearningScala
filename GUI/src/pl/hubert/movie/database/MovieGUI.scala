package pl.hubert.movie.database

import scala.swing._
import BorderPanel.Position._
import scala.io.Source

class MovieGUI extends MainFrame {

    var movies = Array[MovieDTO](MovieDTO("Bambi", 1976, "G", "Hunter are bad!"));
    val movieList = new ListView(movies.map(_.title))
    val titleField = new TextField("")
    val yearField = new TextField("")
    val ratingComboBox = new ComboBox(List("G", "PG", "PG-13", "R", "NC-17", "NR"))
    val descriptionArea = new TextArea

    def openFile = {
        val chooser = new FileChooser
        //Checking if we approve in file chooser
        if (chooser.showOpenDialog(movieList) == FileChooser.Result.Approve) {
            val source = Source.fromFile(chooser.selectedFile)
            val lines = source.getLines
            //Creating movies array
            movies = Array.fill(lines.next.toInt) {
                //Getting first line and assigning it to title
                val title = lines.next
                //Getting next line and assigning it to year
                val year = lines.next.toInt
                //Getting next line and assigning it to rating
                val rating = lines.next
                //Getting desc - multiline - little tricky here
                var desc = ""
                var line = lines.next
                while (line != ".") {
                    desc += line + "\n"
                    line = lines.next
                }
                //Creating MovieDTO based on previously gathered info
                MovieDTO(title, year, rating, desc)
            }
            //closing the stream
            source.close()
            //mapping array to list
            movieList.listData = movies.map(_.title)
        }
    }

    //Something like database of movies
    def saveFile = {
        val chooser = new FileChooser
        if (chooser.showSaveDialog(movieList) == FileChooser.Result.Approve) {
            //Gettinh PrintWriter instance to write text in file being saved
            val pw = new java.io.PrintWriter(chooser.selectedFile)
            //Writing info in file in shape of readable by application txt file
            pw.println(movies.length)
            for (m <- movies) {
                pw.println(m.title)
                pw.println(m.year)
                pw.println(m.rating)
                pw.println(m.description)
                pw.println(".")
            }
            //Closing PrintWriter
            pw.close
        }
    }

    title = "Movie database"
    contents = new BorderPanel {
        layout += movieList -> West
        layout += new BorderPanel {
            layout += new GridPanel(3, 1) {
                contents += new BorderPanel {
                    layout += new Label("Title") -> West
                    layout += titleField -> Center
                }
                contents += new BorderPanel {
                    layout += new Label("Year") -> West
                    layout += yearField -> Center
                }
                contents += ratingComboBox;
            } -> North
            layout += descriptionArea -> Center
        } -> Center
    }
    menuBar = new MenuBar {
        contents += new Menu("File") {
            contents += new MenuItem(Action("Open")(openFile))
            contents += new MenuItem(Action("Save")(saveFile))
            contents += new Separator
            contents += new MenuItem(Action("Exit")(sys.exit(0)))
        }
    }
    size = new Dimension(800, 600)
    centerOnScreen
    visible = true
}
