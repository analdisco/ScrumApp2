package com.interpolis.scrumapp.usecases

import android.os.Handler

class SplashUseCase {
    private val handler = Handler()

    fun load(loadAnimation: () -> Unit,
             exitAnimation: () -> Unit,
             done: () -> Unit) {

        // Start with the loading animation
        loadAnimation()

        // Exit animation
        handler.postDelayed(exitAnimation, 2000)

        // End loading
        // TODO: Load app resources
        handler.postDelayed(done, 3000)
    }
}