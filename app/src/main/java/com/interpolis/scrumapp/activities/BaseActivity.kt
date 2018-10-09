package com.interpolis.scrumapp.activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.WindowManager

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        // Make status bar translucent
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        // Set Window enter & exit animation
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

        super.onCreate(savedInstanceState)
    }
}
