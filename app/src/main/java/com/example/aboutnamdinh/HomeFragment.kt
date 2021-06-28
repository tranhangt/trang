package com.example.aboutnamdinh

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.navigation.Navigation

class HomeFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_home, container, false)
        val item_food = view.findViewById<TextView>(R.id.txtFood)
        item_food.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_foodFragment)
        }
        val item_place = view.findViewById<TextView>(R.id.txtPlace)
        item_place.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_placeFragment)
        }

        val item_person = view.findViewById<TextView>(R.id.txtPerson)
        item_person.setOnClickListener{
            Navigation.findNavController(view).navigate(R.id.action_homeFragment_to_personFragment)
        }
        return view
    }

}