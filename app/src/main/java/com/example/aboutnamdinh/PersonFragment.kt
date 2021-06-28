package com.example.aboutnamdinh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PersonFragment : Fragment() {
    lateinit var person_adapter:FoodAdapter
    private lateinit var personList:ArrayList<Popular>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_person, container, false)
        val act = view.findViewById(R.id.rcv_person) as RecyclerView
        act.layoutManager = LinearLayoutManager(activity)
        personList = getPersonDataList(resources)
        person_adapter = FoodAdapter(personList)
        act.adapter = person_adapter

        return view
    }


}