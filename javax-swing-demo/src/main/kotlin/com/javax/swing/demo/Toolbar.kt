package com.javax.swing.demo

import java.awt.FlowLayout
import java.awt.event.ActionEvent
import java.awt.event.ActionListener
import javax.swing.JButton
import javax.swing.JPanel

class Toolbar(
    private val onHelloButton1Click: () -> Unit,
    private val onGoodbyeButton2Click: () -> Unit,
) : JPanel(), ActionListener {
    private val helloButton: JButton
    private val goodbyeButton: JButton

    init {
        helloButton = JButton("Hello!")
        goodbyeButton = JButton("Goodbye!")

        helloButton.addActionListener(this)
        goodbyeButton.addActionListener(this)

        layout = FlowLayout(FlowLayout.LEFT)
        add(helloButton)
        add(goodbyeButton)
    }

    override fun actionPerformed(
        e: ActionEvent?,
    ) {
        when (e?.source) {
            helloButton -> {
                onHelloButton1Click()
            }

            goodbyeButton -> {
                onGoodbyeButton2Click()
            }

            else -> {}
        }
    }
}
