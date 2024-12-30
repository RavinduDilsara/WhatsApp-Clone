package com.project.whatsappclone

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MessagesFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_messages, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)

        val dataList = listOf(
            Details(R.drawable.image, "Alice", "Hey, how are you?"),
            Details(R.drawable.image, "Bob", "Good morning!"),
            Details(R.drawable.image, "Charlie", "Are we meeting today?"),
            Details(R.drawable.image, "Diana", "I'll call you later."),
            Details(R.drawable.image, "Eve", "Can you send me the report?"),
            Details(R.drawable.image, "Frank", "What's the plan for today?"),
            Details(R.drawable.image, "Grace", "Let's catch up soon!"),
            Details(R.drawable.image, "Hank", "Thanks for your help!"),
            Details(R.drawable.image, "Ivy", "See you at 5 PM."),
            Details(R.drawable.image, "Jake", "How's everything going?"),
            Details(R.drawable.image, "Karen", "I just finished the task."),
            Details(R.drawable.image, "Leo", "Don't forget to bring the files."),
            Details(R.drawable.image, "Mona", "Had a great time yesterday!"),
            Details(R.drawable.image, "Nick", "Can we reschedule our meeting?"),
            Details(R.drawable.image, "Olivia", "I'm running late."),
            Details(R.drawable.image, "Paul", "Please let me know once you're free."),
            Details(R.drawable.image, "Quinn", "Looking forward to our project."),
            Details(R.drawable.image, "Rachel", "Thank you for the quick response!"),
            Details(R.drawable.image, "Steve", "Let's discuss the budget tomorrow."),
            Details(R.drawable.image, "Uma", "Do you have any updates?"),
            Details(R.drawable.image, "Victor", "I'll share the details soon."),
            Details(R.drawable.image, "Wendy", "Can you help me with this?"),
            Details(R.drawable.image, "Xavier", "It was great talking to you."),
            Details(R.drawable.image, "Yara", "I'll send the documents by email."),
            Details(R.drawable.image, "Zane", "Can you join the call now?")

        )

        recyclerView.layoutManager = LinearLayoutManager(context)
        recyclerView.adapter = RecyclerViewAdapter(dataList)
    }

}