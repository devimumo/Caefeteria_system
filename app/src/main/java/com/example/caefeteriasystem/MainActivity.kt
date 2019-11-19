package com.example.caefeteriasystem

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val users_list=ArrayList<User>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Card_click(View(this))



    }


    fun Card_click(view: View) {
        recycler_view.layoutManager= LinearLayoutManager(applicationContext)
        when(view.id) {
            R.id.card1->{

                val tickets_dataaa=User(
                    R.drawable.burger,"Burger","kshs.300")
                users_list.add(tickets_dataaa)
                val adap=Volley_Adapter(users_list)
                val costs: Int=300
val cost: Int=amount.text.toString().toInt()
                val total: Int=cost+costs
                amount.text=total.toString()

               recycler_view.adapter=adap
                adap.notifyDataSetChanged()


            }

            R.id.card2->{

                val tickets_dataaa=User(
                    R.drawable.cocktail,"Cocktail","kshs.200")
                users_list.add(tickets_dataaa)
                val adap=Volley_Adapter(users_list)
                val costs: Int=200
                val cost: Int=amount.text.toString().toInt()
                val total: Int=cost+costs
                amount.text=total.toString()
                recycler_view.adapter=adap
                adap.notifyDataSetChanged()


            }
            R.id.card3->{

                val tickets_dataaa=User(
                    R.drawable.chapati,"Chapati","kshs.20")
                users_list.add(tickets_dataaa)
                val adap=Volley_Adapter(users_list)
                val costs: Int=20
                val cost: Int=amount.text.toString().toInt()
                val total: Int=cost+costs
                amount.text=total.toString()

                adap.notifyDataSetChanged()
                recycler_view.adapter=adap


            }
            R.id.card4->{

                val tickets_dataaa=User(
                    R.drawable.pilau,"Pilau","kshs.100")
                users_list.add(tickets_dataaa)
                val adap=Volley_Adapter(users_list)
                val costs: Int=100
                val cost: Int=amount.text.toString().toInt()
                val total: Int=cost+costs
                amount.text=total.toString()

                adap.notifyDataSetChanged()
                recycler_view.adapter=adap

            }
            R.id.card5->{

                val tickets_dataaa=User(
                    R.drawable.fruits,"fruits","kshs.50")
                users_list.add(tickets_dataaa)
                val adap=Volley_Adapter(users_list)
                val costs: Int=50
                val cost: Int=amount.text.toString().toInt()
                val total: Int=cost+costs
                amount.text=total.toString()

                adap.notifyDataSetChanged()
                recycler_view.adapter=adap

            }
            R.id.card6->{

                val tickets_dataaa=User(
                    R.drawable.pitza,"Pitza","kshs.1300")
                users_list.add(tickets_dataaa)
                val adap=Volley_Adapter(users_list)
                val costs: Int=1300
                val cost: Int=amount.text.toString().toInt()
                val total: Int=cost+costs
                amount.text=total.toString()

                adap.notifyDataSetChanged()
                recycler_view.adapter=adap

            }
            R.id.card7->{

                val tickets_dataaa=User(
                    R.drawable.spaghetti,"Spagheti","kshs.250")
                users_list.add(tickets_dataaa)
                val adap=Volley_Adapter(users_list)
                val costs: Int=250
                val cost: Int=amount.text.toString().toInt()
                val total: Int=cost+costs
                amount.text=total.toString()

                adap.notifyDataSetChanged()
                recycler_view.adapter=adap

            }
            R.id.card8->{

                val tickets_dataaa=User(
                    R.drawable.swiss_roll,"Swiss roll","kshs.450")
                users_list.add(tickets_dataaa)
                val adap=Volley_Adapter(users_list)
                val costs: Int=450
                val cost: Int=amount.text.toString().toInt()
                val total: Int=cost+costs
                amount.text=total.toString()

                adap.notifyDataSetChanged()
                recycler_view.adapter=adap

            }



            }
        }



}
