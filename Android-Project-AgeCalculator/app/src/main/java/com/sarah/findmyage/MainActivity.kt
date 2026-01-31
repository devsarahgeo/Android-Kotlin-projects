package com.sarah.findmyage

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun buFindAgeEvent(view:View){
        val yearOfBirth:Int= txtdob.text.toString().toInt()
        if(yearOfBirth.toInt()==0){
            tvShowAge.text="INVALID INPUT"
            return
        }
        val currentYear=Calendar.getInstance().get(Calendar.YEAR)
        val findAge=currentYear-yearOfBirth
        tvShowAge.text="You are $findAge years old."
    }
}
