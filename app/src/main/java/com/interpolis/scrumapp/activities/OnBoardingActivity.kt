package com.interpolis.scrumapp.activities

import android.os.Bundle
import com.interpolis.scrumapp.R
import com.journaldev.viewpager.CustomPagerAdapter
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnBoardingActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)
        viewPager.adapter = CustomPagerAdapter(this)
    }
}