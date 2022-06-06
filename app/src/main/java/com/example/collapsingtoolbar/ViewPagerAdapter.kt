package com.example.collapsingtoolbar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(fa: FragmentActivity) : FragmentStateAdapter(fa) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> ScreenAFragment.newInstance()
            1 -> ScreenBFragment.newInstance()
            else -> ScreenCFragment.newInstance()
        }
    }
}