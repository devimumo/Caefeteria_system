package com.example.caefeteriasystem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.layout.view.*
import kotlinx.android.synthetic.main.layout.view.*

import kotlin.collections.ArrayList

class Volley_Adapter (val user_list:ArrayList<User>) :RecyclerView.Adapter<Volley_Adapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
val view=LayoutInflater.from(parent.context).inflate(R.layout.layout,parent,false)


    return ViewHolder(view)
    }

    override fun getItemCount(): Int {
return  user_list.size   }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {



val user_data: User =user_list[position]

    holder.itemview.textView3.text=user_data.name

        holder.itemview.textView4.text=user_data.phone_number

        holder.itemview.imageView2.setImageResource(user_data.image)





        holder.itemview.card_view.setOnClickListener {
val gg:String=position.toString()
            val ff=user_data.name
            //holder.itemview.jina.text=gg
//Toast.makeText(it.context,"clicked"+ff,Toast.LENGTH_LONG).show()

          //  val intent= Intent(it.context,SecondActivity::class.java)
           // it.context.startActivity(intent)

//val access=SecondActivity()
  //          access.Toast()


        }




    }

    class  ViewHolder(val itemview: View): RecyclerView.ViewHolder(itemview)
    {

    }




    }









