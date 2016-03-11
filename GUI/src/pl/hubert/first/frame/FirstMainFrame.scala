package pl.hubert.first.frame

import scala.swing._

/**
 * Created on 6 wrz 2015 - 23:56:34
 *
 * @author Hubert
 */
class FirstMainFrame extends MainFrame {
    protected val id = FirstMainFrame.getCounted
    title = "My first GUI with id %d".format(id)
    //Remember! First contents, size next
    contents = Button("Click me!")(new FirstMainFrame)
    size = new Dimension(500, 500)
    centerOnScreen
    visible = true
}

object FirstMainFrame {
    private var id: Int = 0

    private def getCounted: Int = {
        id += 1
        return id
    }
}