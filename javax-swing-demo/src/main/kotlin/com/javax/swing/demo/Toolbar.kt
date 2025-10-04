package com.javax.swing.demo

import java.awt.FlowLayout
import javax.swing.JButton
import javax.swing.JPanel

class Toolbar : JPanel() {
    private val button1: JButton
    private val button2: JButton

    init {
        button1 = JButton("Hello!")
        button2 = JButton("Goodbye!")

        layout = FlowLayout(FlowLayout.LEFT)
        add(button1)
        add(button2)
    }
}
