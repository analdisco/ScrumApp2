package com.interpolis.scrumapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.view.WindowManager
import com.interpolis.scrumapp.R
import com.interpolis.scrumapp.usecases.SplashUseCase
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_splash.*
import android.view.animation.Animation
import android.view.animation.Animation.AnimationListener

class SplashActivity : BaseActivity() {

    private val splashUseCase = SplashUseCase()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Make status and navigation bar translucent
        window.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS, WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS)

        setContentView(R.layout.activity_splash)

        // Load UseCase
        splashUseCase.load({loadAnimation()}, {exitAnimation()}, {done()})
    }

    private fun loadAnimation() {
        // Play load animation
        frameLayoutSplash.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.slide_outside_down))
    }

    private fun exitAnimation() {
        // Add AnimationEnded listener to hide animation object indefinitely
        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_inside_up)
        anim.setAnimationListener(object : AnimationListener {
            override fun onAnimationStart(anim: Animation) {}
            override fun onAnimationRepeat(anim: Animation) {}
            override fun onAnimationEnd(anim: Animation) {
                frameLayoutSplash.visibility = View.GONE
            }
        })

        // Play exit animation
        frameLayoutSplash.startAnimation(anim)
    }

    private fun done() {
        // Application loaded
        startActivity(Intent(this, OnBoardingActivity::class.java))

        // TODO: Setting for skipping onboarding and moving directly to PokerApp
    }
}