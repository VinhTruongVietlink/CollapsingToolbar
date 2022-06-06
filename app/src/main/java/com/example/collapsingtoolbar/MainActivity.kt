package com.example.collapsingtoolbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val pagerAdapter = ViewPagerAdapter(this)
        pager.adapter = pagerAdapter

        TabLayoutMediator(tabLayout, pager) { tab, position ->
            tab.text = "TAB ${(position + 1)}"
        }.attach()
    }
}