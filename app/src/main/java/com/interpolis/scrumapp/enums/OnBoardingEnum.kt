package com.interpolis.scrumapp.enums

import com.interpolis.scrumapp.R

enum class OnBoardingEnum(
        private var mTitleResId: Int,
        private var mLayoutResId: Int)
{
    FIRST(R.string.placeholder, R.layout.onboarding_first),
    SECOND(R.string.placeholder, R.layout.onboarding_second),
    THIRD(R.string.placeholder, R.layout.onboarding_third);

    fun getTitleResId(): Int {
        return mTitleResId
    }

    fun getLayoutResId(): Int {
        return mLayoutResId
    }
}