package com.ovia.hackathon.babyandme

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Splash7Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash7)
    }



    fun monitor(view: View){
        val intent = Intent(this, MonitorActivity::class.java)
        startActivity(intent);
        finish()
    }
}
