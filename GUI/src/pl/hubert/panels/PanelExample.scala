/**
 *
 */
package pl.hubert.panels

import scala.swing._

/**
 * Created on 8 wrz 2015 - 21:21:51
 *
 * @author Hubert
 */
class PanelExample extends MainFrame {
    title = "Scala Panel example"
    //First type of panel
    contents = new GridPanel(2, 2) {
        contents += new Label("This is a label")
        contents += new Button("Click")
        contents += new TextField
        contents += new ComboBox(List("This", "is", "combo", "box"))
    }
    //Second type of panel
    contents = new BoxPanel(Orientation.Vertical) {
        contents += new Label("This is a label")
        contents += new Button("Click")
        contents += new TextField
        contents += new ComboBox(List("This", "is", "combo", "box"))
    }
    //Third type of panel
    contents = new FlowPanel() {
        contents += new Label("This is a label")
        contents += new Button("Click")
        contents += new TextField
        contents += new ComboBox(List("This", "is", "combo", "box"))
    }
    //Fourth type of panel
    import BorderPanel.Position._
    contents = new BorderPanel() {
        layout += new Label("This is a label") -> North
        layout += new Button("Click") -> West
        layout += new TextField -> South
        layout += new ComboBox(List("This", "is", "combo", "box")) -> Center
    }
    menuBar = new MenuBar {
        contents += new Menu("File") {
            contents += new MenuItem(Action("Open") {
                //method here
            })
            contents += new MenuItem(Action("Save") {
                //method here
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
}