package com.interpolis.scrumapp.views

import android.content.Context
import android.util.AttributeSet
import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.interpolis.scrumapp.R

class PokerCardView(context: Context, attrs: AttributeSet?) :
        ConstraintLayout(context, attrs) {

    private val storyPoints: Int =
            context.obtainStyledAttributes(attrs, R.styleable.PokerCardView)
                    .getInt(R.styleable.PokerCardView_storyPoints, 0)

    init {
        View.inflate(getContext(), R.layout.view_poker_card, this)
    }

    private fun configure() {

    }
}