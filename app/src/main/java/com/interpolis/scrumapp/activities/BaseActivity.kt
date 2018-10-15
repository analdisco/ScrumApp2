package com.interpolis.scrumapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        // Set Window enter & exit animation
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)

        super.onCreate(savedInstanceState)
    }
}
