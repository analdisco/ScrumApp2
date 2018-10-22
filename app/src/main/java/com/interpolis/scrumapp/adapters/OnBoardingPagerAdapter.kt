package com.interpolis.scrumapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.interpolis.scrumapp.enums.OnBoardingEnum
import kotlinx.android.synthetic.main.onboarding_carousel_item.view.*

class OnBoardingPagerAdapter(private val context: Context) : androidx.viewpager.widget.PagerAdapter() {

    override fun instantiateItem(collection: ViewGroup, position: Int): Any {
        val modelObject = OnBoardingEnum.values()[position]
        val inflater = LayoutInflater.from(context)
        val layout = inflater.inflate(modelObject.layoutResId, collection, false) as ViewGroup

        layout.textViewTitle.text = context.getText(modelObject.titleResId)
        layout.textViewText.text = context.getText(modelObject.textResId)
        layout.imageViewSlide.setImageDrawable(context.getDrawable(modelObject.imageResId))

        collection.addView(layout)
        return layout
    }

    override fun destroyItem(collection: ViewGroup, position: Int, view: Any) {
        collection.removeView(view as View)
    }

    override fun getCount(): Int {
        return OnBoardingEnum.values().size
    }

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object`
    }
}