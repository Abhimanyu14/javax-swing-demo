package com.javax.swing.demo

import java.awt.Dimension
import javax.swing.JFrame

class AppFrame : JFrame() {
    init {
        title = "Hola Javax Swing Demo!"
        isVisible = true
        size = Dimension(600, 600)
        defaultCloseOperation = DISPOSE_ON_CLOSE
    }
}
