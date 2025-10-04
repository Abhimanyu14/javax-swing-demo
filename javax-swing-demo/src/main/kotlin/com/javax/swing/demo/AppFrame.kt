package com.javax.swing.demo

import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JButton
import javax.swing.JFrame

class AppFrame : JFrame() {
    private val toolbar: Toolbar
    private val textPanel: TextPanel
    private val button: JButton

    init {
        title = "Hola Javax Swing Demo!"
        isVisible = true
        size = Dimension(600, 600)
        defaultCloseOperation = DISPOSE_ON_CLOSE

        toolbar = Toolbar()
        textPanel = TextPanel()
        button = JButton(
            "Greet!"
        ).apply {
            addActionListener { actionEvent ->
                textPanel.appendText(
                    text = "Ohayo gozaimasu!\n",
                )
            }
        }

        layout = BorderLayout()
        add(toolbar, BorderLayout.NORTH)
        add(textPanel, BorderLayout.CENTER)
        add(button, BorderLayout.SOUTH)
    }
}
