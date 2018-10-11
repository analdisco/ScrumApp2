package com.interpolis.scrumapp.enums

import com.interpolis.scrumapp.R

enum class OnBoardingEnum(
        val layoutResId: Int,
        val titleResId: Int,
        val textResId: Int,
        val imageResId: Int) {
    FIRST(R.layout.onboarding_carousel_item, R.string.onboarding_first_title, R.string.onboarding_first_text, R.drawable.onboarding_first2x),
    SECOND(R.layout.onboarding_carousel_item, R.string.onboarding_second_title, R.string.onboarding_second_text, R.drawable.onboarding_second2x),
    THIRD(R.layout.onboarding_carousel_item, R.string.onboarding_third_title, R.string.onboarding_third_text, R.drawable.onboarding_third2x);
}