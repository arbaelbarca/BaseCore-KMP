package org.arba.photopedia.ai

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import org.arba.photopedia.di.initializeKoin

fun main() = application {

    initializeKoin()

    Window(
        onCloseRequest = ::exitApplication,
        title = "AI PhotoPedia",
    ) {
        App()
    }
}