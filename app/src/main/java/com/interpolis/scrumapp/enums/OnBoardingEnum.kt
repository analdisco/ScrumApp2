package com.interpolis.scrumapp.enums

import com.interpolis.scrumapp.R

enum class OnBoardingEnum(private var layoutResId: Int)
{
    FIRST(R.layout.onboarding_first),
    SECOND(R.layout.onboarding_second),
    THIRD(R.layout.onboarding_third);

    fun getLayoutResId(): Int {
        return layoutResId
    }
}