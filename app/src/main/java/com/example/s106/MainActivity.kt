package com.example.s106

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),
        View.OnClickListener,View.OnLongClickListener {

    var counter:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txv.setOnClickListener(this)
        btn.setOnClickListener(this)
        btn2.setOnClickListener(this)
        btn3.setOnClickListener(this)
        txv.setOnLongClickListener(this)


        btn4.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                counter= (1..100).random()
                txv.text = counter.toString()
            }
        })


    }

    override fun onClick(v: View?) {

        if(v==txv || v== btn){
            counter++
        }
        else if(v==btn2) {
            counter += 2

        }
        else{
            counter=0
        }

        txv.text = counter.toString()

    }

    override fun onLongClick(v: View?): Boolean {

        counter+=2
        txv.text = counter.toString()
        return false


    }
}