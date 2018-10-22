package com.interpolis.scrumapp.activities

import android.os.Bundle
import com.interpolis.scrumapp.R

class PokerCardOverviewActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_poker_card_overview)
    }

    // The back button does nothing in this screen
    override fun onBackPressed() {}
}