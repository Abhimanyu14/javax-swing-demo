package com.javax.swing.demo

import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JTextArea

class AppFrame : JFrame() {
    private val textArea: JTextArea
    private val button: JButton

    init {
        title = "Hola Javax Swing Demo!"
        isVisible = true
        size = Dimension(600, 600)
        defaultCloseOperation = DISPOSE_ON_CLOSE

        textArea = JTextArea()
        button = JButton(
            "Greet!"
        ).apply {
            addActionListener { actionEvent ->
                textArea.append("Ohayo gozaimasu!\n")
            }
        }

        layout = BorderLayout()
        add(textArea, BorderLayout.CENTER)
        add(button, BorderLayout.SOUTH)
    }
}
