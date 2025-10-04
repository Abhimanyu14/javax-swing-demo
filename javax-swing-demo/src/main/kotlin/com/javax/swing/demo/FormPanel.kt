package com.javax.swing.demo

import javax.swing.JPanel

class FormPanel : JPanel() {
    init {
        preferredSize = preferredSize.apply {
            width = 20
        }
    }
}
