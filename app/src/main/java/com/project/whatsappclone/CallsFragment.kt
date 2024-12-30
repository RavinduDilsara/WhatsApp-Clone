package com.project.whatsappclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class CallsFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_calls, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        val dataList = listOf(
            Details(R.drawable.image, "Alice", "August 24, 7:24 PM"),
            Details(R.drawable.image, "Bob", "September 15, 8:15 AM"),
            Details(R.drawable.image, "Charlie", "October 18, 9:30 AM"),
            Details(R.drawable.image, "Diana", "November 12, 10:45 AM"),
            Details(R.drawable.image, "Eve", "December 5, 11:00 AM"),
            Details(R.drawable.image, "Frank", "August 8, 12:15 PM"),
            Details(R.drawable.image, "Grace", "September 20, 1:10 PM"),
            Details(R.drawable.image, "Hank", "October 25, 2:20 PM"),
            Details(R.drawable.image, "Ivy", "November 14, 2:50 PM"),
            Details(R.drawable.image, "Jake", "December 3, 3:15 PM"),
            Details(R.drawable.image, "Karen", "August 9, 4:30 PM"),
            Details(R.drawable.image, "Leo", "September 2, 5:00 PM"),
            Details(R.drawable.image, "Mona", "October 19, 5:45 PM"),
            Details(R.drawable.image, "Nick", "November 27, 6:10 PM"),
            Details(R.drawable.image, "Olivia", "December 30, 6:30 PM"),
            Details(R.drawable.image, "Paul", "August 4, 6:45 PM"),
            Details(R.drawable.image, "Quinn", "September 16, 7:00 PM"),
            Details(R.drawable.image, "Rachel", "October 21, 7:10 PM"),
            Details(R.drawable.image, "Steve", "November 28, 7:20 PM"),
            Details(R.drawable.image, "Tina", "December 10, 7:25 PM"),
            Details(R.drawable.image, "Uma", "August 7, 7:30 PM"),
            Details(R.drawable.image, "Victor", "September 22, 7:35 PM"),
            Details(R.drawable.image, "Wendy", "October 6, 7:40 PM"),
            Details(R.drawable.image, "Xavier", "November 15, 7:45 PM"),
            Details(R.drawable.image, "Yara", "December 2, 7:50 PM")

        )

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = RecyclerViewAdapter(dataList)
    }
}