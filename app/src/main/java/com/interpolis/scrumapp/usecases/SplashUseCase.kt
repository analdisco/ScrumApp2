package com.interpolis.scrumapp.usecases

import android.os.Handler

class SplashUseCase {
    private val splashTimeMs: Long = 3000
    private val handler = Handler()

    fun load(loadAnimation: () -> Unit,
             exitAnimation: () -> Unit,
             done: () -> Unit) {

        // Start with the loading animation
        loadAnimation()

        // Exit animation
        handler.postDelayed(exitAnimation, splashTimeMs-500)

        // End loading
        // TODO: Load app resources
        handler.postDelayed(done, splashTimeMs)
    }
}