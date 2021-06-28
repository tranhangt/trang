package com.example.aboutnamdinh

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FoodFragment : Fragment() {
    lateinit var food_adapter:FoodAdapter
    private lateinit var foodList:ArrayList<Popular>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_food, container, false)
        val act = view.findViewById(R.id.rcv_food) as RecyclerView
        act.layoutManager = LinearLayoutManager(activity)
        foodList = getFoodDataList(resources)
        food_adapter = FoodAdapter(foodList)
        act.adapter = food_adapter

        return view
    }

}