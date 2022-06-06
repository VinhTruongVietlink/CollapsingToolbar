package com.example.collapsingtoolbar

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_screen_a.*

class ScreenAFragment : Fragment() {

    companion object {
        fun newInstance(): Fragment = ScreenAFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_screen_a, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val myAdapter = MyListAdapter()
        rcvContent.adapter = myAdapter
        val list = arrayListOf<String>()
        for (i in 1..20) {
            list.add("A${i}")
        }
        myAdapter.submitList(list)

        swipeRefreshLayout.setOnRefreshListener {
            Handler(Looper.getMainLooper()).postDelayed({
                swipeRefreshLayout.isRefreshing = false
            }, 1000)
        }
    }
}