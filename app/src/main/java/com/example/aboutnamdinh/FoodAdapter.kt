package com.example.aboutnamdinh

import android.icu.text.Transliterator
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FoodAdapter(
    private val foodList: ArrayList<Popular>
) : RecyclerView.Adapter<FoodViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodViewHolder {
        return FoodViewHolder(LayoutInflater.from(parent.context)
            .inflate(R.layout.item_layout, parent, false))
    }

    override fun onBindViewHolder(holder: FoodViewHolder, position: Int) {
        holder.bind(foodList[position])
    }

    override fun getItemCount(): Int {
        return foodList.size
    }

}
class FoodViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
    private val txtName: TextView = itemView.findViewById(R.id.txt_name)
    private val img: ImageView = itemView.findViewById(R.id.img_item)

    fun bind(popular: Popular){
        txtName.text = popular.name
        if(popular.image != null){
            img.setImageResource(popular.image)
        } else{
            img.setImageResource(R.drawable.pho)
        }
    }
}