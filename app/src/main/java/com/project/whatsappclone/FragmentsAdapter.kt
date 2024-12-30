package com.project.whatsappclone

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class FragmentsAdapter(activity: MainActivity) : FragmentStateAdapter(activity) {

    val fragments = listOf(
        MessagesFragment(),
        CallsFragment(),
        StatusFragment()
    )

    override fun createFragment(position: Int): Fragment {

        return fragments[position]
    }

    override fun getItemCount(): Int {

        return fragments.size
    }
}