package com.javax.swing.demo

import javax.swing.BorderFactory
import javax.swing.JPanel

class FormPanel : JPanel() {
    init {
        preferredSize = preferredSize.apply {
            width = 200
        }

        val innerBorder = BorderFactory.createTitledBorder("Add Person")
        val outerBorder = BorderFactory.createEmptyBorder(8, 8, 8, 8)
        border = BorderFactory.createCompoundBorder(outerBorder, innerBorder)
    }
}
