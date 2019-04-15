package com.example.bbdlunch

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //display icon in the action bar?
//        supportActionBar?.setDisplayShowHomeEnabled(true)
//        supportActionBar?.setIcon(R.drawable.ic_bbd_bigger)
    }
}
