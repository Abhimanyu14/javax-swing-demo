package com.javax.swing.demo

import java.awt.Dimension
import javax.swing.JFrame
import javax.swing.SwingUtilities

fun main() {
    SwingUtilities.invokeLater {
        JFrame().apply {
            title = "Hola Javax Swing Demo!"
            isVisible = true
            size = Dimension(600, 600)
            defaultCloseOperation = JFrame.DISPOSE_ON_CLOSE
        }
    }
}
