package com.javax.swing.demo

import java.awt.BorderLayout
import java.awt.Dimension
import javax.swing.JPanel
import javax.swing.JScrollPane
import javax.swing.JTextArea

class TextPanel : JPanel() {
    private val textArea: JTextArea

    init {
        size = Dimension(600, 600)

        textArea = JTextArea()
        layout = BorderLayout()

        val scrollPane = JScrollPane(textArea)
        add(scrollPane, BorderLayout.CENTER)
    }

    fun appendText(
        text: String,
    ) {
        textArea.append(text)
    }
}
