package com.interpolis.scrumapp.activities

import android.content.Intent
import android.os.Bundle
import android.view.View
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
        setContentView(R.layout.activity_splash)

        splashUseCase.load({loadAnimation()}, {exitAnimation()}, {done()})
    }

    private fun loadAnimation() {
        frameLayoutSplash.startAnimation(AnimationUtils.loadAnimation(applicationContext, R.anim.slide_outside_down))
    }

    private fun exitAnimation() {
        val anim = AnimationUtils.loadAnimation(applicationContext, R.anim.slide_inside_up)
        anim.setAnimationListener(object : AnimationListener {
            override fun onAnimationStart(anim: Animation) {}
            override fun onAnimationRepeat(anim: Animation) {}
            override fun onAnimationEnd(anim: Animation) {
                frameLayoutSplash.visibility = View.GONE
            }
        })
        frameLayoutSplash.startAnimation(anim)
    }

    private fun done() {
        startActivity(Intent(this, OnBoardingActivity::class.java))
    }
}