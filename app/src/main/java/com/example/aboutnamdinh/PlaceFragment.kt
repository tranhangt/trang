package com.example.aboutnamdinh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PlaceFragment : Fragment() {
    lateinit var place_adapter:FoodAdapter
    private lateinit var placeList:ArrayList<Popular>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_place, container, false)
        val act = view.findViewById(R.id.rcv_place) as RecyclerView
        act.layoutManager = LinearLayoutManager(activity)
        placeList = getPlaceDataList(resources)
        place_adapter = FoodAdapter(placeList)
        act.adapter = place_adapter
        return view
    }

}