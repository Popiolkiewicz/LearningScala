/**
 *
 */
package pl.hubert.menus

import scala.swing._

/**
 * Created on 8 wrz 2015 - 20:41:26
 *
 * @author Hubert
 */
class MenuExample extends MainFrame {

    val textArea = new TextArea

    title = "Scala menu example"
    contents = textArea
    menuBar = new MenuBar {
        contents += new Menu("File") {
            contents += new MenuItem(Action("Open") {
                openFile
            })
            contents += new MenuItem(Action("Save") {
                saveFile
            })
            contents += new Separator
            contents += new MenuItem(Action("Exit") {
                sys.exit(0)
            })
        }
    }
    size = new Dimension(500, 500)
    centerOnScreen
    visible = true

    def openFile = {
        val chooser = new FileChooser
        if (chooser.showOpenDialog(null) == FileChooser.Result.Approve) {
            val source = scala.io.Source.fromFile(chooser.selectedFile)
            textArea.text = source.mkString
            source.close()
        }
    }

    def saveFile = {
        val chooser = new FileChooser
        if (chooser.showSaveDialog(null) == FileChooser.Result.Approve) {
            val printWriter = new java.io.PrintWriter(chooser.selectedFile)
            printWriter.print(textArea.text)
            printWriter.close()
        }
    }
}