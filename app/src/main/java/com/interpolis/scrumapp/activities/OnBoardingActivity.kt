package com.interpolis.scrumapp.activities

import android.os.Bundle
import com.interpolis.scrumapp.R
import com.interpolis.scrumapp.adapters.OnBoardingPagerAdapter
import kotlinx.android.synthetic.main.activity_onboarding.*

class OnBoardingActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_onboarding)

        // Set adapter for the Onboarding View Pager
        viewPager.adapter = OnBoardingPagerAdapter(this)
        indicator.setViewPager(viewPager)
    }

    // The back button does nothing in this screen
    override fun onBackPressed(){}
}