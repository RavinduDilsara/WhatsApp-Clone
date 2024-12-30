package com.project.whatsappclone

import android.os.Bundle

import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tabLayout: TabLayout = findViewById(R.id.tabLayout)
        val viewPager2: ViewPager2 = findViewById(R.id.viewPager2)
        val fragmentsAdapter: FragmentStateAdapter = FragmentsAdapter(this)

        viewPager2.adapter = fragmentsAdapter

        TabLayoutMediator(tabLayout, viewPager2) { tab, position ->
            when (position) {

                0 -> tab.text = "Messages"
                1 -> tab.text = "calls"
                2 -> tab.text = "Status"
            }


        }.attach()

    }
}